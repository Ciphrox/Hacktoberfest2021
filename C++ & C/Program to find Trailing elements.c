#include<iostream.h>
#include<stdio.h>
#include<conio.h>
#include<string.h>

   void install(char x,char y);
   void pop();
   int pon(char u);
   int pot(char v);
   int checkstatus(int a,int b);

   int n,d,f,xn,xt,top=-1;
   char X,Y;
   int a[20][20];
   char terminal[20],nonterm[20];

   struct production
   {
      char l;
      char r[10];
      int rear;
   };
   struct stack
   {
      char nt;
      char t;
   };
   struct stack st[20];
   struct production prod[20];


void main()
{
  clrscr();


    cout<<"Enter the number of terminals: ";
    cin>>d;
    cout<<"Enter the terminal symbols for your production: ";
    for(int k=0;k<d;k++)
    {
            cin>>terminal[k];
    }

    //Input of non-terminal symbols

      cout<<"\nEnter the number of non-terminals: ";
      cin>>f;
      cout<<"Enter the non-terminal symbols for your production: ";
      for(k=0;k<f;k++)
      {
            cin>>nonterm[k];
      }

   
      cout<< "\nEnter the number of productions: ";
      cin>>n;
      for(int i=0;i<=n-1;i++)
      {
               cout<<"Enter the "<< i+1<<" production: ";
               cin>>prod[i].l;
        cout<<"->";
               cin>>prod[i].r;
               prod[i].rear=strlen(prod[i].r);
      }

       for(int p=0;p<f;p++)
            {
              for(int q=0;q<d;q++)
                        {
                           a[p][q]=0;
                        }
            }


              for(i=0;i<=n-1;i++)
              {
                for(int j=0;j<d;j++)
                        {
                                    if(prod[i].r[prod[i].rear-1]==terminal[j])
                                    install(prod[i].l,prod[i].r[prod[i].rear-1]);
                                    else if(prod[i].r[prod[i].rear-2]==terminal[j])
                                    install(prod[i].l,prod[i].r[prod[i].rear-2]);
                        }
              }

   
             while(top>-1)
             {
                        pop();
                        for(int c=0;c<=n-1;c++)
                        {
                                    if(prod[c].r[prod[c].rear-1]==X)
                                    install(prod[c].l,Y);
                        }
             }

   
            cout<<"\n\n****************************************************";
            cout<<"\n         TRAILING ELEMENTS OF GIVEN PRODUCTION ";
            cout<<"\n****************************************************** ";
            cout<<endl<<" ";
            for(int w=0;w<d;w++)
            cout<<" "<<terminal[w];
            cout<<endl;
            for(p=0;p<f;p++)
            {
                        cout<<nonterm[p]<<" ";
                        for(int q=0;q<d;q++)
                        {
                                    cout<<a[p][q]<<" ";
                        }
                        cout<<endl;
            }
            cout<<endl<<endl;
            for(i=0;i<f;i++)
            {
               cout<<"Leading("<<nonterm[i]<<")="<<" "<<"{";
               for(int j=0;j<d;j++)
               {
                 if(a[i][j]==1)
                  cout<<terminal[j]<<",";
               }
               cout<<"}"<<endl;
            }
            getch();
 }

void  install(char x,char y)
{
  int g;
  xn=pon(x);
  xt=pot(y);
  g=checkstatus(xn,xt);
  if(g==0)
   return;
  else if(g==1)
    {
      top++;
      st[top].nt=x;
      st[top].t=y;
      a[xn][xt]=1;
    }
}

void pop()
{
  X=st[top].nt;
  Y=st[top].t;
  top--;
}

int pon(char u)
{
  for(int x=0;x<f;x++)
  {
    if(u==nonterm[x])
            return x;
  }
}

int pot(char v)
{
  for(int x=0;x<d;x++)
  {
            if(v==terminal[x])
                        return x;
  }
}

int checkstatus(int xn,int xt)
{
   if(a[xn][xt]==1)
   return 0;
   else
   return 1;
}
