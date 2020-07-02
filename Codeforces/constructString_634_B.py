'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1335/problem/B
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    n,a,b=map(int,input().split())

    list1=[]
    for i in range(a-b+1):
        list1.append('a')
    for i in range(b-1):
        list1.append(chr(ord('a')+i+1))

    for i in range(n):
        print(list1[i%(len(list1))],end='')
    print()
