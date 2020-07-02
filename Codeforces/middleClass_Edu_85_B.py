'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1334/problem/B
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    n,x=map(int,input().split())
    list1=[int(x) for x in input().split()]
    list1.sort()
    list1.reverse()

    wealthyCount=0
    sumBurles=0
    for i in range(len(list1)):
        sumBurles+=list1[i]
        if sumBurles/(i+1)>=x:
            wealthyCount+=1
        else:
            break

    print(wealthyCount)
