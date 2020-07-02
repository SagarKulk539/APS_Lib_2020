'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1371/problem/B
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    n,r=map(int,input().split())

    if r<n:
        temp=r*(r+1)
        temp//=2
        print(temp)
    else:
        n-=1
        temp=n*(n+1)
        temp//=2
        temp+=1
        print(temp)
