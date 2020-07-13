'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1380/problem/A
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    nVal=int(input())
    permList=[int(x) for x in input().split()]

    flag=0
    for i in range(1,len(permList)-1):
        Lval=min(permList[0:i])
        Rval=min(permList[i+1:])
        if permList[i]>Lval and permList[i]>Rval:
            flag=1
            index1=permList.index(Lval)
            index3=permList.index(Rval)
            print("YES")
            print(index1+1,i+1,index3+1)
            break


    if flag==0:
        print("NO")
