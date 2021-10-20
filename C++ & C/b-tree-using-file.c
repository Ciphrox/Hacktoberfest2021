#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>
#include <stdbool.h>


typedef struct {
    int chave;
    int linkdir;
} CHLINK;

typedef struct {
    int np; // armazene aqui o nro da pagina no arquivo
    int cont; // armazene aqui a quantidade de chaves existentes no vetor CHLINK[]
    CHLINK item[3]; // a chave[0] eh desprezada, e o linkdir[0] eh na verdade o link esquerdo da chave[1]
} PAGINA;


// funcao principal
void inserir(char nomearq[], int* raiz, int ch);

// Implementação de funções auxiliares
FILE* abrir_arquivo(char nomearq[]) {
    FILE *arq = fopen(nomearq, "r+");
    return arq;
}
void alterar_arquivo(FILE* arq, PAGINA pagina) {
    fwrite(&pagina, sizeof(PAGINA), 1, arq);
}

bool pagina_cheia(PAGINA pagina) {
    return pagina.cont >= 2;
}

void escrever_em_arquivo(FILE* arq, int deslocamento, PAGINA pagina) {
    fseek(arq, deslocamento*sizeof(PAGINA), SEEK_SET);
    alterar_arquivo(arq, pagina);
}

PAGINA recuperar_pagina(FILE* arq, int deslocamento) {
    PAGINA pagina;
    fseek(arq, deslocamento*sizeof(PAGINA), SEEK_SET);
    fread(&pagina, sizeof(PAGINA), 1, arq);
    return pagina;
}

PAGINA* criar_pagina_vazia() {
    PAGINA* nova_pagina = (PAGINA*) malloc(sizeof(PAGINA));
    nova_pagina->cont = 0;
    nova_pagina->np = -1;
    for (int i = 0; i < 3; ++i) {
        nova_pagina->item[i].chave = -1;
        nova_pagina->item[i].linkdir = -1;
    }
    return nova_pagina;
}

void criar_nova_raiz(FILE *arq, int ch, int* raiz, int np, PAGINA* filho) {
    PAGINA* nova_pagina = criar_pagina_vazia();
    nova_pagina->item[1].chave = ch;
    nova_pagina->item[0].linkdir = *raiz;
    nova_pagina->item[1].linkdir = filho ? filho->np : -1;
    nova_pagina->cont = 1;
    nova_pagina->np = np;
    *raiz = np > -1 ? np : 0;
    escrever_em_arquivo(arq, np, *nova_pagina);
}

void inserir_em_pagina(int ch, int posicao, PAGINA* pagina, PAGINA* filho) {
    int indice = pagina->cont;
    while (indice > posicao) {
        pagina->item[indice+1] = pagina->item[indice];
        indice--;
    }
    pagina->item[indice+1].chave = ch;
    pagina->item[indice+1].linkdir = filho ? filho->np : -1;
    pagina->cont++;
}

void dividir_pagina(FILE* arq, int ch, int posicao, int* chave_promovida, PAGINA* pagina_para_dividir, PAGINA* filho, PAGINA* *novo_filho, int* np) {
    int mediana, indice, MIN = 1, MAX = 2;

    if (posicao > MIN) mediana = MAX;
    else mediana = MIN;

    *novo_filho = criar_pagina_vazia();

    indice = mediana + 1;
    while (indice <= 2) {
        (*novo_filho)->item[indice - mediana] = pagina_para_dividir->item[indice];
        indice++;
    }

    pagina_para_dividir->cont = mediana;
    (*novo_filho)->cont = MAX - mediana;
    (*novo_filho)->np = *np + 1;
    (*np) = (*novo_filho)->np + 1;

    if (posicao <= 1) inserir_em_pagina(ch, posicao, pagina_para_dividir, filho);
    else inserir_em_pagina(ch, posicao - mediana, *novo_filho, filho);

    *chave_promovida = pagina_para_dividir->item[pagina_para_dividir->cont].chave;
    (*novo_filho)->item[0].linkdir = pagina_para_dividir->item[pagina_para_dividir->cont].linkdir;
    pagina_para_dividir->cont--;
    pagina_para_dividir->item[2].linkdir = -1;

    escrever_em_arquivo(arq, pagina_para_dividir->np, *pagina_para_dividir);
    escrever_em_arquivo(arq, (*novo_filho)->np, **novo_filho);
}

int inserir_util(FILE* arq, int* raiz, int ch, int* chave_promovida, int* np, PAGINA** filho) {
    if ((*raiz) == -1) {
        *chave_promovida = ch;
        *filho = NULL;
        return 1;
    }

    PAGINA pagina_atual = recuperar_pagina(arq, *raiz);

    int posicao;
    if (ch < pagina_atual.item[1].chave) posicao = 0;
    else {
        posicao = pagina_atual.cont;
        while (ch < pagina_atual.item[posicao].chave && posicao > 1) posicao--;
        if (ch == pagina_atual.item[posicao].chave) return 0;
    }

    /*
     * Flag=0 indica que houve algum erro ao inserir chave ou não tem chave promovida
     * Flag=1 indica que há uma chave promovida
     */
    int flag = inserir_util(arq, &pagina_atual.item[posicao].linkdir, ch, chave_promovida, np, filho);

    if (flag==0) return flag;
    else if (!pagina_cheia(pagina_atual)){
        inserir_em_pagina(*chave_promovida, posicao, &pagina_atual, *filho);
        escrever_em_arquivo(arq, pagina_atual.np, pagina_atual);
        return 0;
    } else {
        // "Split"
        dividir_pagina(arq, *chave_promovida, posicao, chave_promovida, &pagina_atual, *filho, filho, np);
        return 1;
    }
}

void encontrar_maior_np(FILE *arq, int raiz, int* np) {
    int i;
    if (raiz > -1) {
        PAGINA pagina = recuperar_pagina(arq, raiz);
        for (i = 0; i < pagina.cont; ++i) {
            encontrar_maior_np(arq, pagina.item[i].linkdir, np);
            if (pagina.np > *np) *np = pagina.np;
        }
        encontrar_maior_np(arq, pagina.item[i].linkdir, np);
    }
}

void traversal(FILE *arq, int raiz) {
    int i;
    if (raiz > -1) {
        PAGINA pagina;
        fseek(arq, raiz*sizeof(PAGINA), SEEK_SET);
        fread(&pagina, sizeof(PAGINA), 1, arq);
        for (i = 0; i < pagina.cont; ++i) {
            traversal(arq, pagina.item[i].linkdir);
            printf("[%d]: %d\n", pagina.np, pagina.item[i+1].chave);
        }
        traversal(arq, pagina.item[i].linkdir);
    }
}


void inserir(char nomearq[], int* raiz, int ch) {

    // abra o arquivo
    FILE *arq = abrir_arquivo(nomearq);
    if (arq == NULL) return; // Não foi possível abrir o arquivo.

    int np = 0;
    encontrar_maior_np(arq, *raiz, &np);

    int chave_promovida;
    PAGINA* filho;

    // faca a insercao / divisao / promocao etc.
    int temChavePromovida = inserir_util(arq, raiz, ch, &chave_promovida, &np, &filho);

    // atualize o nro da *raiz se necessario
    if (temChavePromovida) criar_nova_raiz(arq, chave_promovida, raiz, np, filho);

    // feche o arquivo
    fclose(arq);
}


int main()
{
	char nomearq[] = "minhaarvore.bin";
	int raiz = 7;
	int chave = 10;


	FILE *arq = abrir_arquivo(nomearq);

	traversal(arq, raiz);
    	fclose(arq);
}



