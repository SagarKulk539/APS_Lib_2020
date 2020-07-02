'''
APS-2020
Problem Description, Input, Output : https://www.codechef.com/JUNE20B/problems/XYSTR
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    str1=input()
    list1=list(str1)

    i=0
    count=0
    while i<len(list1)-1:
        if list1[i]=='x' and list1[i+1]=='y':
            count+=1
            i+=2
        elif list1[i]=='y' and list1[i+1]=='x':
            count+=1
            i+=2
        else:
            i+=1

    print(count)
