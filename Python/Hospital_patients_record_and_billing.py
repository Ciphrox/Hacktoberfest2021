import csv
import os
import datetime
x = datetime.datetime.now()
date=x.strftime("%d %b,%Y")
time=x.strftime("%I:%M:%S %p")
#billing system
def bill():
    f=open("bills.csv","w")
    fw=csv.writer(f)
    fw.writerow(['\t'+'*'*15,'ALPHA HOSPITAL','*'*15,'\n'])
    fw.writerow(['\tHERE IS YOUR BILL !\n '])
    fw.writerow(['\tSr.No.','Item','Qyt','price'])
    print("\tEnter details of meds: \n")
    lst=[0]*5
    i,med=1,0
    while True:
        p=input('\tItem name : ')
        q=int(input('\tqyt : '))
        r=int(input('\tprice : '))
        lst=[" ",i,p,q,r]
        print()
        i+=1
        med+=q*r
        fw.writerow(lst)
        ch=input("\tanother ? (y/n)  : ").lower()
        if ch!='y':
            break
    os.system("clear||cls")
    fw.writerow(['\t'+'*'*47])
    fw.writerow(['\tPHARMACY: ','\t'*2,med])
    fw.writerow(["\tDOCTOR's FEE : ","\t"*2," 500.00"])
    fw.writerow(['\tDISCOUNT : ','\t'*2,med*.1])
    fw.writerow(["\tGRAND TOTAL : ",'\t'*2,500+(med-med*.1)])
    fw.writerow(['\t'+'*'*47])
    fw.writerow(['\t'*2+'Thankyou ! get well soon '])
    fw.writerow(['\t'+'*'*47])
    f.close()
    f=open("bills.csv")
    fr=csv.reader(f)
    for i in fr:
        for j in i:
            print(j,end='\t')
        print()
    f.close()
#patient check-in details
def patient():
    f=open('patient.csv','w')
    fw=csv.writer(f)
    fw.writerow(['\t'*2,'PATIENT RECORD','\n'])
    fw.writerow(['\t '+'  WELCOME TO ALPHA HOSPITAL\n'])
    fw.writerow(['*'*52])
    p=input("Patient's name : ")
    q=input("Patient's age : ")
    q1=input("Father's name : ")
    q2=input("Mother's name : ")
    q3=input("Care taker's name : ")
    r=input("Phone numbers (max 2) : ").split()
    s=input('Disease/suffering/remark : ')
    os.system("clear||cls")
    fw.writerow(["\n\tNAME : "+p,'\t'*3+date,"\n\tAGE : "+q,'\t'*3+time])
    fw.writerow(["\n\tFather : "+q1,"\n\tMother : "+q2])
    fw.writerow(["\n\tCare taker's name : "+q3])
    fw.writerow(["\n\tPh.No(s). : "+r[0]+","+r[-1]])
    fw.writerow(["\n\tREMARK : "+s])
    fw.writerow(["\n\tDoctor's Fee : 500/-"])
    fw.writerow(["\n",'*'*52])
    f.close()
    f=open('patient.csv')
    fr=csv.reader(f)
    for i in fr:
        for j in i:
            print(j,end='\t')
    _=input("\nDo you want your Bill here (y/n) : ").lower()
    if _=='y':
        bill()
    else:
        print("THANKYOU FOR VISITING")
patient()
