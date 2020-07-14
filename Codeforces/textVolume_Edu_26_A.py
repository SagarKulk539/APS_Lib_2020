'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/837/problem/A
Code by : Sagar Kulkarni
'''

n=int(input())
list1=[x for x in input().split()]

if len(list1)==1:
    count=0
    for i in range(len(list1[0])):
        if list1[0][i].isupper():
            count+=1
    print(count)
else:
    maxCount=0
    for i in range(len(list1)):
        count=0
        for j in range(len(list1[i])):
            if list1[i][j].isupper():
                count+=1
        if count>=maxCount:
            maxCount=count
    print(maxCount)
