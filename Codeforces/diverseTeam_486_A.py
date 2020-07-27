'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/988/problem/A
Code by : Sagar Kulkarni
'''

n,k=map(int,input().split())
list1=[int(x) for x in input().split()]
list2=[]
indexList=[]

for i in range(len(list1)):
    if list1[i] not in list2:
        list2.append(list1[i])
        indexList.append(i+1)

if len(indexList)<k:
    print("NO")
else:
    print("YES")
    for i in range(k):
        print(indexList[i],end=" ")
    print()
