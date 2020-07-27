'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/978/problem/B
Code by : Sagar Kulkarni
'''

n=int(input())
str1=input()
list1=list(str1)

count=0
while True:
    len1=len(list1)

    for i in range(len1-2):
        if list1[i]=='x' and list1[i+1]=='x' and list1[i+2]=='x':
            list1.pop(i+2)
            count+=1
            break

    len2=len(list1)

    if len1==len2:
        break
print(count)
