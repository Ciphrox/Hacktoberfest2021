def HasCycle(top):
    s = set()
    while (top is not None):
        if top in s:
            return 1
        else:
            s.add(top)
            top = top.next
            
    return 0
  
  
  
  
  
  
  
