# # #method 1
# # num1=int(input("enter the first no:"))
# # num2=int(input("enter the second no:"))
# # print("before swapping no are",num1,"and",num2)
# # temp=num1
# # num1=num2
# # num2=temp
# # print("After swapping the no are ",num1,"and",num2)

# # second method(without using third variable)

# num1=int(input("enter the first no:"))
# num2=int(input("enter the second no:"))
# print("before swapping no are",num1,"and",num2)
# num1=num1+num2
# num2=num1-num2
# num1=num1-num2
# print("After swapping the no are ",num1,"and",num2)

#third method
num1=int(input("enter the first no:"))
num2=int(input("enter the second no:"))
print("before swapping no are",num1,"and",num2)
num1,num2=num2,num1
print("After the swapping num1 is:",num1)
print("After the swapping num2 is:",num2)

