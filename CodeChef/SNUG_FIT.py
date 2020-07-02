'''
APS-2020
Problem Description, Input, Output : https://www.codechef.com/FEB20B/problems/SNUG_FIT
Code by : Sagar Kulkarni
'''

def min(a,b):
    if a<b:
        return a
    else:
        return b

n=int(input())

for _ in range(0,n):
    maxSumDiameter=0
    N=int(input())
    list1=[int(x) for x in input().split()]
    list2=[int(x) for x in input().split()]

    list1.sort()
    list2.sort()

    for i in range(0,N):
        maxSumDiameter+=min(list1[i],list2[i])

    list1=[]
    list2=[]
    print(maxSumDiameter)
