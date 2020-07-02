'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1301/problem/A
Code by : Sagar Kulkarni
'''

T=int(input())

for _ in range(0,T):
    a=input()
    b=input()
    c=input()

    list1=list(a)
    list2=list(b)
    list3=list(c)

    for i in range(0,len(list3)):
        if list3[i]==list2[i]:
            temp=list1[i]
            list1[i]=list3[i]
            list3[i]=temp
        else:
            temp=list2[i]
            list2[i]=list3[i]
            list3[i]=temp
    if list1==list2:
        print("YES")
    else:
        print("NO")
