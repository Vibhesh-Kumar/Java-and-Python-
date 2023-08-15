punc='''!@#$%^&*()_;:'"?/<>,.[]{}\|'''
string=input("Enter the String:")
emptystr=''
for i  in  string:
    if i  not  in punc:
        emptystr=emptystr+i
print(emptystr)

