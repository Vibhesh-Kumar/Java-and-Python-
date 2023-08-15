# first method
# print("Enter the number")

# for i in range(1,100):
#     if i%13==0:
#         print(i)

# second method
l=[23,52,63,63, 39,73,43]
result=list(filter(lambda x:x%13==0,l))
print("the no divisible are:",result)