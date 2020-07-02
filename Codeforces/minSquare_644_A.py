'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1360/problem/A
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    a,b=map(int,input().split())
    if a==b:
        tmp=a+a
        tmp=tmp**2
        print(tmp)
    else:
        if a<b:
            tmp=a+a
            newTmp=max(b,tmp)
            print(newTmp**2)
        else:
            tmp=b+b
            newTmp=max(a,tmp)
            print(newTmp**2)
