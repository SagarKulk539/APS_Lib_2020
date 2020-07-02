'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1328/problem/A
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    a,b=map(int,input().split())
    #print(a%b)
    if a%b!=0:
        temp1=a%b
        temp2=a-temp1
        print(temp2+b-a)
    else:
        print(0)
