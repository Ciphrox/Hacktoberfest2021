class Node:
    def __init__(self, freq,data):
        self.freq= freq
        self.data=data
        self.left = None
        self.right = None    
        
def decodeHuff(root, s):
    s=list(s)
    s=[int(i) for i in s]
    while len(s)!=0 :
        decodeHuf(root,s,root)

def decodeHuf(root, s,parent):
    
    
    if not (root.left or root.right) :
        print(root.data,end='')
        return
    if len(s)==0 :
        return
    
    x=s[0]
    del s[0]
    if x == 1 :
        decodeHuf(root.right,s,parent)
    else :
        decodeHuf(root.left,s,parent)
        
    
      
