'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1284/problem/A
Code by : Sagar Kulkarni
'''

n,m=map(int,input().split())

list1=[x for x in input().split()]
list2=[x for x in input().split()]

N=int(input())

for _  in range(0,N):
    num=int(input())

    print(list1[(num%len(list1))-1]+list2[(num%len(list2))-1])
