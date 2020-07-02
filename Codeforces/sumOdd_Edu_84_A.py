'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1327/problem/A
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    n,k=map(int,input().split())

    if (n&1)==(k&1) and n>=(k**2):
        print("YES")
    else:
        print("NO")
