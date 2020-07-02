'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/699/problem/A
Code by : Sagar Kulkarni
'''

import sys

n=int(input())
temp=input()
list1=[int(x) for x in input().split()]
leftRight=list(temp)

minValue=sys.maxsize

for i in range(len(leftRight)-1):
    if leftRight[i]=='R' and leftRight[i+1]=='L':
        meter=list1[i]+list1[i+1]
        meter//=2
        if meter-list1[i]<minValue:
            minValue=meter-list1[i]

if minValue==sys.maxsize:
    print(-1)
else:
    print(minValue)
