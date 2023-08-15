#sum of natural numbers (method 1)
# num=int(input("Enter the number:"))
# sum=0
# for i in range(1,num+1):
#     sum=sum+i
# print(sum)


#second method
# num=int(input("Enter the numbers:"))
# sum=0
# i=1
# while (i<=num):
#     sum=sum+i
#     i=i+1
# print(sum)    

#third method
num=int(input("Enter the numbers:"))
sum=0
if num<0:
    print("Please enter the positive no:")
else :
    while (num>0):
        sum=sum+num
        num=num-1
print(sum)