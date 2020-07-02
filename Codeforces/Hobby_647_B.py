'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1362/problem/B
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    n=int(input())
    list1=[int(x) for x in input().split()]

    list1.sort()
    val=0
    for i in range(1,1024):
        list2=[x^i for x in list1]
        list2.sort()
        if list1==list2:
            val=i
            break
    if val==0:
        print(-1)
    else:
        print(val)
