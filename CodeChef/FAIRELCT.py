'''
APS-2020
Problem Description, Input, Output : https://www.codechef.com/JAN21C/problems/FAIRELCT
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    n1,n2=map(int,input().split())

    list1=[int(x) for x in input().split()]
    list2=[int(x) for x in input().split()]

    list1.sort()
    list2.sort()
    list2.reverse()

    noOfSwaps=0
    for i in range(min(n1,n2)):
        if sum(list1)>sum(list2):
            break
        (list1[i],list2[i])=(list2[i],list1[i])
        noOfSwaps+=1

    if sum(list1)>sum(list2):
        print(noOfSwaps)
    else:
        print(-1)
