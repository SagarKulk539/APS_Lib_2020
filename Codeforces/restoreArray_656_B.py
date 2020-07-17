'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1385/problem/B
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    n=int(input())
    list1=[int(x) for x in input().split()]

    list2=[]
    for i in range(len(list1)):
        if list1[i] not in list2:
            list2.append(list1[i])
            print(list1[i],end=" ")
    print()
