def isPlaindrome(s):
    str = ""
    for i in s:
        str = i + str
    if str == s:
        print("Given string is a palindrome.")
    else:
        print("Given string is not a palindrome.")
s = input("Enter any string: ")
isPlaindrome(s)
