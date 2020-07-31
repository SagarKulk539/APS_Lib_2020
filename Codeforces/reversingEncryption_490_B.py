'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/999/problem/B
Code by : Sagar Kulkarni
'''

n=int(input())
str1=input()
list1=list(str1)

for i in range(2,n+1):
    if n%i==0:
        list2=list1[:i]
        list2.reverse()
        for j in range(i,n):
            list2.append(list1[j])

        list1=list2[:]

print("".join(list1))
