'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1345/problem/A
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    row,col=map(int,input().split())
    edges=row*(col-1)+col*(row-1)
    open=row*col

    if edges>open:
        print("NO")
    else:
        print("YES")
