A=[[2,5,3],
    [5,6,2], 
    [4,6,1]]
B=[[2,6,1],[5,3,8],[2,6,8]]
# num=input("Enter the  first matrix: ")
# num1=input("Enter the  Second matrix: ")

result=[[0,0,0],[0,0,0],[0,0,0]]
for i in range(len(A)):
    for j in range(len(A[0])):
        result[i][j]=A[i][j]+B[i][j]
for r in result:
    print(r)