'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1380/problem/B
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    str1=input()
    list1=list(str1)

    countR=0
    countP=0
    countS=0

    for i in range(len(list1)):
        if list1[i]=='R':
            countR+=1
        elif list1[i]=='P':
            countP+=1
        elif list1[i]=='S':
            countS+=1

    newList=[countR,countP,countS]
    index=newList.index(max(newList))

    if index==0:
        print('P'*len(list1))
    elif index==1:
        print('S'*len(list1))
    elif index==2:
        print('R'*len(list1))
