'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/701/problem/B
Code by : Sagar Kulkarni
'''

n,m=map(int,input().split())
rowList=[0 for _ in range(n)]
colList=[0 for _ in range(n)]

rowRooks=0
colRooks=0

totalUnattacked=n*n
finalList=[]
for _ in range(m):
    r,c=map(int,input().split())

    r-=1
    c-=1

    if rowList[r]==0:
        rowList[r]=1;
        totalUnattacked-=n;
        totalUnattacked+=colRooks;
        rowRooks+=1;
    if colList[c]==0:
        colList[c]=1;
        totalUnattacked-=n;
        totalUnattacked+=rowRooks;
        colRooks+=1;
    finalList.append(totalUnattacked)

for i in range(len(finalList)):
    print(finalList[i],end=" ")
