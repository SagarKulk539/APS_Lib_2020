'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1440/problem/A
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    n,c0,c1,h=map(int,input().split())

    str1=input()
    list1=[int(x) for x in str1]

    zeroCount=list1.count(0)
    oneCount=list1.count(1)

    cost1=(zeroCount*c0)+(oneCount*c1)

    cost2=zeroCount*h
    cost2+=n*c1

    cost3=oneCount*h
    cost3+=n*c0

    print(min(cost1,cost2,cost3))
