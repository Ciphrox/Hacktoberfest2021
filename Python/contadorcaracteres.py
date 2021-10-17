from tkinter import *

def contar():
    '''Função que conta a quantidade de caracteres digitados
    e a quantidade de espaços'''
    total = "Total de caracteres digitados: " + str(len(enome.get()))
    contespacos = 0
    cont = 0
    for espaco in enome.get():
        if ' ' == espaco:
            contespacos += 1
        else:
            cont += 1
    naoespacos = "Total de caracteres sem espaços: " + str(cont)
    lespacos = "Total de espaços: " + str(contespacos)
    lcontar['text'] = total
    nespacos = cont
    lnespaco['text'] = naoespacos
    lespaco['text'] = lespacos


i = Tk()
i.title('Conta pra mim')
i.geometry('300x200')

#textos, botoes e resultados
lnome = Label(i,text='Digite seu nome',font='Times')
lnome.pack()
enome = Entry(i,bg='yellow')
enome.pack()
bnome = Button(i,text='contar',command=contar,bg='#1f1')
bnome.pack()
lcontar = Label(i,text='')
lcontar.pack()
lespaco = Label(i,text='')
lespaco.pack()
lnespaco = Label(i,text='')
lnespaco.pack()


i.mainloop()
