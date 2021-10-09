#The Guess game

import os
import random as rn

def guess_game():    
    print ("\t"*2,"TEST YOUR LUCK ,SEE YOUR SCORE\n","\t"*2,"_"*32)
    print("\n\t\t BEST OF LUCK !\n","\t"*2,"TRY TO GUESS THE NO.👍\n","\t"*2,"_"*32)
    
    n,g,c,r,w=rn.randint(0,100),0,1,"",0
    while g!=n:
        print (" ↪️ATTEMPT :", c)
        try:
            g=int(input("\t"*3+"guess a no.    "))
        except:
            if w<3:
                print('\n'+'\t'*3,'😑Please enter numbers only\n')
                w+=1
                g=int(input("\t"*3+"guess a no.    "))
            else:
                os.system('clear||cls')
                print('\n'+'\t'*3,'I WARNED YOU\n')
                guess_game()
        if g<n:
            print ("\n"+"\t"*3,"❗ Let your imagination fly higher")
            c+=1
            continue
        
        elif g>n:
            print("\n"+"\t"*3,"❗❗think a bit smaller one")
            c+=1
            continue
        
        elif g==n: 
            print ("\n","="*20,"  ✅ Nailed it ! ","="*20)
            print ("\t"*6,"🔥SCORE => [", 110-c*10,"]")
            r=input ("\n "+"\t"*2+"   🔁 RESTART (yes/no) : ").lower()
            if r=="yes" :
                os.system("clear||cls")
                print ("\n","\t"*3,"//---NEW GAME---//\n")
                guess_game()
            else:
                os.system("clear||cls")
                print ('\n'+"\t"*3,"GAME OVER\n"+'\t'*3,'Thankyou')
guess_game()
