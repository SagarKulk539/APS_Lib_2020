'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1316/problem/A
Code by : Sagar Kulkarni
'''

T=int(input())

for _ in range(T):
    n,m=map(int,input().split())
    list1=[int(x) for x in input().split()]

    sum=0
    for i in range(len(list1)):
        if i!=0:
            sum+=list1[i]

    newVar=m-list1[0]
    if sum>=newVar:
        print(m)
    else:
        print(list1[0]+sum)
