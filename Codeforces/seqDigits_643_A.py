'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1355/problem/A
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    a1,k=map(int,input().split())
    iteration=0
    newNumber=a1
    while iteration<k-1:
        list1=sorted(str(newNumber))
        min=int(list1[0])
        max=int(list1[-1])
        if min==0:
            break
        newNumber=newNumber+(min*max)
        iteration+=1

    print(newNumber)
