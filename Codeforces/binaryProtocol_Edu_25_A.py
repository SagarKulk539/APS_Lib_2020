'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/825/problem/A
Code by : Sagar Kulkarni
'''

n=int(input())
str1=input()
list1=list(str1)

count1=0
newList=[]
for i in range(len(list1)):
    if list1[i]=='1':
        count1+=1
    else:
        newList.append(str(count1))
        count1=0

newList.append(str(count1))
print("".join(newList))
