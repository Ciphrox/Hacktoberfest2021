from tkinter import *

def click(r,c):
    global usr
    global gamestatus
    if(usr=='X' and grd[r][c]==0 and gamestatus==True):
        grd[r][c]='X'
        usr='O'
        curr[r][c].configure(text='X',bg="white")

    if(usr=='O' and grd[r][c]==0 and gamestatus==True):
        grd[r][c]='O'
        usr='X'
        curr[r][c].configure(text='O',bg="gray")
    
    checkWin()

def checkWin():
    global gamestatus
    for i in range(3):
        if grd[0][i]==grd[1][i]==grd[2][i]!=0:
            for j in range(3):
                curr[j][i].config(bg="snow4",fg="white")
            gamestatus=False
    for i in range(3):            
        if grd[i][0]==grd[i][1]==grd[i][2]!=0:
            for j in range(3):
                curr[i][j].config(bg="snow4",fg="white")
            gamestatus=False
    if grd[0][2]==grd[1][1]==grd[2][0]!=0:
            curr[0][2].config(bg="snow4",fg="white")
            curr[1][1].config(bg="snow4",fg="white")
            curr[2][0].config(bg="snow4",fg="white")
            gamestatus=False
    if grd[0][0]==grd[1][1]==grd[2][2]!=0:
            for j in range(3):
                curr[j][j].config(bg="snow4",fg="white")
            gamestatus=False
        
root=Tk()
root.title("Tic Tac Toe")
root.maxsize(900, 520)

usr="O"
gamestatus=True
grd=[[0,0,0],
     [0,0,0],
     [0,0,0]]

curr=[[0,0,0],
     [0,0,0],
     [0,0,0]]
fr = Frame(root)
fr.pack()
for i in range(3):
    for j in range(3):
        curr[i][j]=Button(fr, bg = 'lightyellow', font=('arial',30,'bold'),width = 12, height = 3,
        command=lambda r=i, c=j:click(r,c))
        curr[i][j].grid( row=i,column=j)

mainloop()
