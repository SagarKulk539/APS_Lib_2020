'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1339/problem/B
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    n=int(input())
    list1=[int(x) for x in input().split()]
    list1.sort()

    i=0
    j=n-1
    list2=[]
    while i<j:
        list2.append(list1[j])
        list2.append(list1[i])
        i+=1
        j-=1

    if n&1==1:
        list2.append(list1[i])

    list2.reverse()
    for elem in list2:
        print(elem,end=" ")
    print()
