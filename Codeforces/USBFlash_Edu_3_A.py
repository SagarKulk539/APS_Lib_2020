'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/609/problem/A
Code by : Sagar Kulkarni
'''

n=int(input())
m=int(input())
list1=[]

for _ in range(n):
    list1.append(int(input()))

list1.sort()
list1.reverse();

i=0
count=0

while m!=0:
    if list1[i]>m:
        count+=1
        break
    m-=list1[i]
    count+=1
    i+=1

print(count)
