'''
APS-2020
Problem Description, Input, Output : https://www.codechef.com/FEB20B/problems/CASH
Code by : Sagar Kulkarni
'''

T=int(input())
for _ in range(0,T):
    cumulativeSum=0
    N,K=map(int,input().split())
    list1=[int(x) for x in input().split()]

    for elem in list1:
        cumulativeSum+=(elem%K)

    print(cumulativeSum%K)
