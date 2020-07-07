'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/733/problem/A
Code by : Sagar Kulkarni
'''

str1=input()
list1=list(str1)

pos=0
listNew=[]

for i in range(len(list1)):
    if list1[i]=='A' or list1[i]=='E' or list1[i]=='I' or list1[i]=='O' or list1[i]=='U' or list1[i]=='Y':
        listNew.append((i+1)-pos)
        pos=i+1

pos-=1
listNew.append(len(list1)-pos)
print(max(listNew))
