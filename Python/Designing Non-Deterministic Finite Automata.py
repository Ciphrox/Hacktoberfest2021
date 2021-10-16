def stateX(n):
	#if length of n become 0
	#then print not accepted
	if(len(n)==0):
		print("string not accepted")
		
	else:
		#if at zero index
		#'a' found call
		#stateY function	
		if (n[0]=='a'):
			stateY(n[1:])
		
		#if at zero index
		#'b' then print
		#not accepted
		elif (n[0]=='b'):
			print("string not accepted")
		
def stateY(n):
	#if length of n become 0
	#then print not accepted
	if(len(n)==0):
		print("string not accepted")
		
	else:
		#if at zero index
		#'a' then print
		#not accepted
		if (n[0]=='a'):
			print("string not accepted")
			
		#if at zero index
		#'b' found call
		#stateZ function	
		elif (n[0]=='b'):
			stateZ(n[1:])
			
def stateZ(n):
	#if length of n become 0
	#then print accepted
	if(len(n)==0):
		print("string accepted")
		
	else:
		#if at zero index
		#'b' found call
		#stateZ function	
		if (n[0]=='a'):
			stateZ(n[1:])
			
		#if at zero index
		#'b' found call
		#stateZ function	
		elif (n[0]=='b'):
			stateZ(n[1:])			
		

			
			
#take input
n=input()

#call stateA function
#to check the input
stateX(n)
