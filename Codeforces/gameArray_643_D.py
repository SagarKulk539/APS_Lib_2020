'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1355/problem/D
Code by : Sagar Kulkarni
'''

n,s=map(int,input().split())

val1=s//n
val2=s-((n-1)*val1)

if val1>1:
    print("YES")
    for _ in range(n-1):
        print(val1,end=" ")
    print(val2)
    print(1)
else:
    print("NO")
