'''
APS-2020
Problem Description, Input, Output : https://www.codechef.com/problems/SALARY
Code by : Sagar Kulkarni
'''

import math
T=int(input())

for _ in range(0,T):
    a=int(input())
    list1=[int(x) for x in input().split()]

    sum=0
    for elem in list1:
        sum+=elem

    print(sum-a*min(list1))
