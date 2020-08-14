/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1398/problem/B
Code by : Sagar Kulkarni
*/

for _ in range(int(input())):
    str1=input()
    list1=list(str1)

    list2=[]
    count1=0

    for i in range(len(list1)):
        if list1[i]=='0':
            list2.append(count1)
            count1=0
        else:
            count1+=1

    if count1!=0:
        list2.append(count1)

    list2.sort()
    list2.reverse()

    sum1=0
    for i in range(0,len(list2),2):
        if i<=len(list2)-1:
            sum1+=list2[i]

    print(sum1)


