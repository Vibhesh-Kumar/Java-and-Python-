lower=int(input("Enter the lower no:"))
upper=int(input("Enter the upper no"))
for num in range(lower,upper+1):
    order=len(str(num))
    sum=0
    temp=num
    while temp>0:
        rem=temp%10
        sum=sum+rem**order
        temp=temp//10
    if(sum==num):
        print(num)
