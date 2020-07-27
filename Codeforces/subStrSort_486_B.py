'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/988/problem/B
Code by : Sagar Kulkarni
'''

n=int(input())
list1=[]
for i in range(n):
    str1=input()
    list1.append(str1)

list1.sort(key=len)
flag=0
for i in range(len(list1)-1):
    if list1[i] not in list1[i+1]:
        flag=1
        break
if flag==0:
    print("YES")
    for i in range(n):
        print(list1[i])
else:
    print("NO")
