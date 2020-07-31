'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1003/problem/B
Code by : Sagar Kulkarni
'''

a,b,x=map(int,input().split())
list1=[]

if a>b:
    flag=0

    countZero=0
    countOne=0

    for _ in range(x+1):
        if flag==0:
            list1.append('0')
            countZero+=1
            flag=1
        else:
            list1.append('1')
            countOne+=1
            flag=0

    remZero=a-countZero
    remOne=b-countOne

    if x%2==0:
        list1.pop()
        str1="".join(list1)
        beforeStr='0'*remZero
        afterStr='1'*remOne
        print(beforeStr+str1+afterStr+'0')
    else:
        str1="".join(list1)
        afterStr='1'*remOne
        beforeStr='0'*remZero
        print(beforeStr+str1+afterStr)
else:
    flag=1

    countZero=0
    countOne=0

    for _ in range(x+1):
        if flag==0:
            list1.append('0')
            countZero+=1
            flag=1
        else:
            list1.append('1')
            countOne+=1
            flag=0

    remZero=a-countZero
    remOne=b-countOne

    if x%2==0:
        list1.pop()
        str1="".join(list1)
        beforeStr='1'*remOne
        afterStr='0'*remZero
        print(beforeStr+str1+afterStr+'1')
    else:
        str1="".join(list1)
        beforeStr='1'*remOne
        afterStr='0'*remZero
        print(beforeStr+str1+afterStr)
