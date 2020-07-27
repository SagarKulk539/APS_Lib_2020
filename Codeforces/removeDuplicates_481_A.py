'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/978/problem/A
Code by : Sagar Kulkarni
'''

n=int(input())
list1=[int(x) for x in input().split()]
list1.reverse()
list2=[]
for i in range(len(list1)):
    if list1[i] not in list2:
        list2.append(list1[i])

list2.reverse()
print(len(list2))
for i in range(len(list2)):
    print(list2[i],end=" ")
print()
