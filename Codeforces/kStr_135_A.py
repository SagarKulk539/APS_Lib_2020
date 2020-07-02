'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/219/problem/A
Code by : Sagar Kulkarni
'''

k=int(input())
str1=input()
list1=list(str1)

list2=[]
flag=0
finalList=[]
for i in range(len(list1)):
    if list1[i] not in list2:
        list2.append(list1[i])
        if list1.count(list1[i])%k!=0:
            flag=1
            break
        else:
            finalList.append(list1[i]*(list1.count(list1[i])//k))
if flag==1:
    print(-1)
else:
    print("".join(finalList)*k)
