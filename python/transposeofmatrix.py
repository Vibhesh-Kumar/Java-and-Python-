A=[[1,2,3],[1,6,3],[2,4,5]]
r=[[0,0,0],[0,0,0],[0,0,0]]
for i in range(len(A)):
    for j in range(len(A[0])):
        r[i][j]=A[j][i]

for k in r:
    print(k)