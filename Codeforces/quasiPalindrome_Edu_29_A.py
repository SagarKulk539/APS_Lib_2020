'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/863/problem/A
Code by : Sagar Kulkarni
'''

str1=input()
list1=list(str1)

list2=list1[:]
list2.reverse()

if list1==list2:
    print("YES")
else:
    count=0
    for i in range(len(list2)):
        if list2[i]!='0':
            break
        else:
            count+=1

    for i in range(count):
        list2.append('0')

    list3=list2[:]
    list3.reverse()

    if list3==list2:
        print("YES")
    else:
        print("NO")
