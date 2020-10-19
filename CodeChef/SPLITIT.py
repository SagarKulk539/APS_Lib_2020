'''
APS-2020
Problem Description, Input, Output : https://www.codechef.com/problems/SPLITIT
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    n=int(input())
    list1=list(input())

    if list1[-1] in list1[:n-1]:
        print("YES")
    else:
        print("NO")
