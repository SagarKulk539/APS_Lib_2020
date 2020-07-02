'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/160/problem/A
Code by : Sagar Kulkarni
'''

n=int(input())
list1=[int(x) for x in input().split()]

list1.sort()
list1.reverse()

count=0
for i in range(n):
    count+=1
    if sum(list1[:i+1])>sum(list1[i+1:]):
        break

print(count)
