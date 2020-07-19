'''
APS-2020
Problem Description, Input, Output : https://www.codechef.com/COOK120B/problems/EVENTUAL
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    n=int(input())
    str1=input()
    list1=list(str1)

    list2=[]
    flag=0
    for i in range(len(list1)):
        if list1[i] not in list2:
            list2.append(list1[i])
            if list1.count(list1[i])%2!=0:
                flag=1
                break
    if flag==0:
        print("YES")
    else:
        print("NO")
