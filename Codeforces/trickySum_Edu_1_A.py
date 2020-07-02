'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/598/problem/A
Code by : Sagar Kulkarni
'''

import math

for _ in range(int(input())):
    n=int(input())

    totalSum=(n*(n+1))//2

    val=int(math.floor(math.log2(n)))
    powerSum=int(math.pow(2,val+1)-1)

    totalSum-=2*powerSum
    print(totalSum)
