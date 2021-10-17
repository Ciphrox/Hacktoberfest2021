#include<stdio.h>
#include<stdlib.h>
#define N (int)20
int arr[N+1][N+1];
void insert_edge(int u,int v)
{
    if(u>N)
        printf("Source node does not exists\n");
    if(v>N)
        printf("Destination node does not exists\n");
    if(arr[u][v])
        printf("Edge already exists\n");
    else
    {
        ++arr[u][v];
        ++arr[v][u];
    }
}
//Depth first search (DFS) recursive code
int visited[N+1];
void DFS(int u)
{
	++visited[u];
	for(int i=1;i<N+1;++i)
	{
		if(arr[u][i] && !visited[i])
		{
			printf("%d->%d\n",u,i);
			++visited[i];
			DFS(i);
		}
			
	}
}
void display()
{
    for(int i=1;i<=N;++i)
    {
        for(int j=1;j<=N;++j)
            printf("%2d",arr[i][j]);
        printf("\n");
    }
}
int main()
{
    int choice=1;
    while(1)
    {
        int u,v;
        printf("Enter source and destination: ");
        scanf("%d %d",&u,&v);
        insert_edge(u,v);
        printf("\nWould you like to continue: ");
        scanf("%d",&choice);
        if(!choice)
            break;
    }
    DFS(1);
    display();
    return 0;
}
