def trib_iter(m):
    lista=[m]
    c=0
    d=True
    while d==True:
        novalista=[]
        for n in lista:
            if n in [0,1,2]:
                c+=1
            else:
                for i in range(1,4):
                    if n-i in [0,1,2]:
                        c+=1
                    else:
                        if n-i<0:
                            pass
                        else:
                            novalista.append(n-i)
        if novalista==[]:
            d=False
        else:
            lista=novalista
    return c
