'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1304/problem/A
Code by : Sagar Kulkarni
'''

T=int(input())

for _ in range(0,T):
    rab1,rab2,inc1,dec2=map(int,input().split())

    if (rab2-rab1)%(inc1+dec2)==0:
        print(int((rab2-rab1)/(inc1+dec2)))
    else:
        print('-1')
