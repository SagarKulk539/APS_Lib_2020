'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1354/problem/A
Code by : Sagar Kulkarni
'''

import math

for _ in range(int(input())):
    a,b,c,d=map(int,input().split())

    if b>=a:
        print(b)
    elif c<=d:
        print(-1)
    else:
        restRequired=a-b
        restGained=c-d
        temp=math.ceil(restRequired/restGained)
        print((c*temp)+b)
