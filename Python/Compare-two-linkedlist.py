def CompareLists(headA, headB):
    currentA=headA
    currentB=headB
    while currentA!=None or currentB!=None:
        if currentA==None:
            return 0
        elif currentB==None:
            return 0
        if currentA.data!=currentB.data:
            return 0
        currentA=currentA.next
        currentB=currentB.next
    return 1
  
  
  
  
  
  
  
  
  
  
  
