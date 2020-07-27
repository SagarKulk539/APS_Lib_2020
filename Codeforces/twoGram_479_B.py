'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/977/problem/B
Code by : Sagar Kulkarni
'''

n=int(input())
str1=input()
list1=list(str1)

maxCountStr=""
maxCount=0
for i in range(len(list1)-1):
    newStr="".join(list1[i:i+2])
    count=1
    for j in range(i+1,len(list1)-1):
        strVal="".join(list1[j:j+2])
        if strVal==newStr:
            count+=1
    if count>maxCount:
        maxCountStr=newStr
        maxCount=count

print(maxCountStr)
