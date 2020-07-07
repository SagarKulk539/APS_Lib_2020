'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/746/problem/B
Code by : Sagar Kulkarni
'''

n=int(input())
str1=input()
list1=list(str1)

listA=[]
listB=[]

if len(list1)%2!=0:
    for i in range(1,len(list1)):
        if i%2!=0:
            listA.append(list1[i])
        else:
            listB.append(list1[i])

    listA.reverse()

    print("".join(listA)+str1[0]+"".join(listB))
else:
    for i in range(0,len(list1)):
        if i%2!=0:
            listA.append(list1[i])
        else:
            listB.append(list1[i])

    listB.reverse()
    print("".join(listB)+"".join(listA))
