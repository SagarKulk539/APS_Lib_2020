'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1374/problem/A
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    xVal,yVal,n=map(int,input().split())

    divVal=n//xVal
    finVal=(divVal*xVal)+yVal
    if finVal>n:
        divVal-=1
        print((divVal*xVal)+yVal)
    else:
        print((divVal*xVal)+yVal)
