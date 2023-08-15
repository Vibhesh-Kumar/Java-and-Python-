term=int(input("Enter the no of terms:"))
result=list(map(lambda x:2**x,range(term+1)))
print(result)
for i in range (term+1):
    print("power of 2 is",i,"is",result[i])
    


