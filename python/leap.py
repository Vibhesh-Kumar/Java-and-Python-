num=int(input("Enter the no:"))
if((num%100==0) and (num%400==0)) or (num%4==0):
    print("leap year")
else :
    print("not leap year")
