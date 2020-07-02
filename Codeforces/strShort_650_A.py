'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1367/problem/A
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    str1=input();
    list1=list(str1)

    if len(list1)==2:
        print(str1)
    else:
        list2=[]
        for i in range(1,len(list1)-2,2):
            list2.append(list1[i])
        print(list1[0]+"".join(list2)+list1[-1])
