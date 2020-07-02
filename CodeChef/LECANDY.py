'''
APS-2020
Problem Description, Input, Output : https://www.codechef.com/problems/LECANDY
Code by : Sagar Kulkarni
'''

n=int(input())
for _ in range(0,n):
    N,C = map(int,input().split())
    list1=[int(x) for x  in input().split()]
    if sum(list1)<=C:
        print('Yes')
    else:
        print('No')
