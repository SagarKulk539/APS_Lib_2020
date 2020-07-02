'''
APS-2020
Problem Description, Input, Output : https://www.codechef.com/FEB20B/problems/THEATRE
Code by : Sagar Kulkarni
'''

from itertools import permutations
import math
def createCombination():
    list1=[0,1,2,3]
    list2=list(permutations(list1))
    return list2[:]

T=int(input())
totalProfit=0
for _ in range(0,T):
    N=int(input())
    mainArr=[[0]*4 for _ in range(4)]
    for _ in range(0,N):
        a,b=input().split()
        b=int(b)

        if b==12:
            if a=='A':
                mainArr[0][0]+=1
            elif a=='B':
                mainArr[1][0]+=1
            elif a=='C':
                mainArr[2][0]+=1
            elif a=='D':
                mainArr[3][0]+=1

        elif b==3:
            if a=='A':
                mainArr[0][1]+=1
            elif a=='B':
                mainArr[1][1]+=1
            elif a=='C':
                mainArr[2][1]+=1
            elif a=='D':
                mainArr[3][1]+=1

        elif b==6:
            if a=='A':
                mainArr[0][2]+=1
            elif a=='B':
                mainArr[1][2]+=1
            elif a=='C':
                mainArr[2][2]+=1
            elif a=='D':
                mainArr[3][2]+=1

        elif b==9:
            if a=='A':
                mainArr[0][3]+=1
            elif a=='B':
                mainArr[1][3]+=1
            elif a=='C':
                mainArr[2][3]+=1
            elif a=='D':
                mainArr[3][3]+=1

    # for i in range(0,4):
    #     for j in range(0,4):
    #         print(mainArr[i][j],end=" ")
    #     print()
    list1=createCombination()
    priceList=[25,50,75,100]
    maxForEach=-math.inf

    for elem in list1:
        dailyProfit=0
        tempList=[0,0,0,0]
        for i in range(0,4):
            tempList[i]=mainArr[i][elem[i]]
        tempList.sort()

        for i in range(0,4):
            if tempList[i]==0:
                dailyProfit-=100
            else:
                dailyProfit+=tempList[i]*priceList[i]

        if maxForEach<dailyProfit:
            maxForEach=dailyProfit

    totalProfit+=maxForEach
    print(maxForEach)

print(totalProfit)
