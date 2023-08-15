num=int(input("Enter the numbers:"))
order=len(str(num))
temp=num
sum=0
while num>0:
    rem=num%10
    sum=(rem**order)+sum
    num=num//10
#num=num+1
if (temp==sum):
    print("Armstrong number")
else:
    print("Not armstrong no")