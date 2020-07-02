'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1353/problem/C
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    n=int(input())
    n=n//2

    sq3=n**3
    sq2=n**2
    sq1=n
    res=(8*sq3+12*sq2+4*sq1)//3
    print(res)
