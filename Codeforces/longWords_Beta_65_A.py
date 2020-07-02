'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/71/problem/A
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    str1=input()
    if len(str1)>10:
        newStr=str1[0:1]+str((len(str1)-2))+str1[-1]
        print(newStr)
    else:
        print(str1)
