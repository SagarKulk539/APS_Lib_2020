'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1368/problem/B
Code by : Sagar Kulkarni
'''

def multiply(list2):
    res=1
    for elem in list2:
        res*=elem
    return res

k=int(input())
list1=[1,1,1,1,1,1,1,1,1,1]

while multiply(list1[:])<k:
    for i in range(10):
        list1[i]+=1
        if multiply(list1[:])>=k:
            break

str1=('c'*list1[0])+('o'*list1[1])+('d'*list1[2])+('e'*list1[3])+('f'*list1[4])+('o'*list1[5])+('r'*list1[6])+('c'*list1[7])+('e'*list1[8])+('s'*list1[9])
print(str1)
