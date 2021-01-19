'''
APS-2020
Problem Description, Input, Output : http://codeforces.com/contest/1474/problem/A
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    n=int(input())
    str1=input()
    list1=list(str1)
    list1=[int(x) for x in list1]

    list2=[1]
    list3=[list1[0]+list2[0]]

    for i in range(1,n):
        tmp1=list1[i]+0
        tmp2=list1[i]+1

        if tmp2!=list3[i-1]:
            list2.append(1)
            list3.append(tmp2)
        else:
            list2.append(0)
            list3.append(tmp1)

    for i in range(n):
        print(list2[i],end="")
    print()
