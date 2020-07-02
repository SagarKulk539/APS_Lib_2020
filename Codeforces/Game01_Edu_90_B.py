'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1373/problem/B
Code by : Sagar Kulkarni
'''

t=int(input())
for _ in range(t):
    string1=input()
    listOf01=list(string1)

    if True:
        while True:
            break

        aChance=True
        bChance=False

        while True:
            length=len(listOf01)
            if length<2 or listOf01.count('1')==0 or listOf01.count('0')==0:
                break
            for i in range(length-1):
                if listOf01[i]!=listOf01[i+1]:
                    listOf01.pop(i)
                    listOf01.pop(i)
                    break
            aChance = not aChance
            bChance = not bChance

        if True:
            if aChance:
                print("NET")
            else:
                print("DA")
