'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/747/problem/B
Code by : Sagar Kulkarni
'''

n=int(input())
str1=input()
list1=list(str1)

countA=list1.count('A')
countG=list1.count('G')
countC=list1.count('C')
countT=list1.count('T')
countSymb=list1.count('?')

countList=[countA,countG,countC,countT];
if countA==countG and countA==countC and countA==countT and countSymb==0:
    print(str1)
elif countSymb==len(list1):
    if countSymb%4==0:
        noOfA=countSymb//4
        noOfG=countSymb//4
        noOfC=countSymb//4
        noOfT=countSymb//4

        strA=noOfA*'A'
        strG=noOfG*'G'
        strC=noOfC*'C'
        strT=noOfT*'T'

        print(strA+strG+strC+strT)
    else:
        print("===")
else:
    maxCount=max(countList)
    index=countList.index(max(countList))

    if index==0:
        remG=maxCount-countG
        remC=maxCount-countC
        remT=maxCount-countT

        temp=remG+remC+remT
        countSymb-=temp
        if countSymb>=0:
            for _ in range(remG):
                for i in range(len(list1)):
                    if list1[i]=='?':
                        list1[i]='G'
                        break

            for _ in range(remC):
                for i in range(len(list1)):
                    if list1[i]=='?':
                        list1[i]='C'
                        break

            for _ in range(remT):
                for i in range(len(list1)):
                    if list1[i]=='?':
                        list1[i]='T'
                        break
            countSymb2=list1.count('?')
            if countSymb2%4==0:
                noOfA=countSymb//4
                noOfG=countSymb//4
                noOfC=countSymb//4
                noOfT=countSymb//4

                for _ in range(noOfA):
                    for i in range(len(list1)):
                        if list1[i]=='?':
                            list1[i]='A'
                            break

                for _ in range(noOfG):
                    for i in range(len(list1)):
                        if list1[i]=='?':
                            list1[i]='G'
                            break

                for _ in range(noOfC):
                    for i in range(len(list1)):
                        if list1[i]=='?':
                            list1[i]='C'
                            break

                for _ in range(noOfT):
                    for i in range(len(list1)):
                        if list1[i]=='?':
                            list1[i]='T'
                            break
            if list1.count('?')==0:
                print("".join(list1))
            else:
                print("===")
        else:
            print("===")
    elif index==1:
        remA=maxCount-countA
        remC=maxCount-countC
        remT=maxCount-countT

        temp=remA+remC+remT
        countSymb-=temp
        if countSymb>=0:
            for _ in range(remA):
                for i in range(len(list1)):
                    if list1[i]=='?':
                        list1[i]='A'
                        break

            for _ in range(remC):
                for i in range(len(list1)):
                    if list1[i]=='?':
                        list1[i]='C'
                        break

            for _ in range(remT):
                for i in range(len(list1)):
                    if list1[i]=='?':
                        list1[i]='T'
                        break
            countSymb2=list1.count('?')
            if countSymb2%4==0:
                noOfA=countSymb//4
                noOfG=countSymb//4
                noOfC=countSymb//4
                noOfT=countSymb//4

                for _ in range(noOfA):
                    for i in range(len(list1)):
                        if list1[i]=='?':
                            list1[i]='A'
                            break

                for _ in range(noOfG):
                    for i in range(len(list1)):
                        if list1[i]=='?':
                            list1[i]='G'
                            break

                for _ in range(noOfC):
                    for i in range(len(list1)):
                        if list1[i]=='?':
                            list1[i]='C'
                            break

                for _ in range(noOfT):
                    for i in range(len(list1)):
                        if list1[i]=='?':
                            list1[i]='T'
                            break
            if list1.count('?')==0:
                print("".join(list1))
            else:
                print("===")
        else:
            print("===")
    elif index==2:
        remG=maxCount-countG
        remA=maxCount-countA
        remT=maxCount-countT

        temp=remG+remA+remT
        countSymb-=temp
        if countSymb>=0:
            for _ in range(remG):
                for i in range(len(list1)):
                    if list1[i]=='?':
                        list1[i]='G'
                        break

            for _ in range(remA):
                for i in range(len(list1)):
                    if list1[i]=='?':
                        list1[i]='A'
                        break

            for _ in range(remT):
                for i in range(len(list1)):
                    if list1[i]=='?':
                        list1[i]='T'
                        break
            countSymb2=list1.count('?')
            if countSymb2%4==0:
                noOfA=countSymb//4
                noOfG=countSymb//4
                noOfC=countSymb//4
                noOfT=countSymb//4

                for _ in range(noOfA):
                    for i in range(len(list1)):
                        if list1[i]=='?':
                            list1[i]='A'
                            break

                for _ in range(noOfG):
                    for i in range(len(list1)):
                        if list1[i]=='?':
                            list1[i]='G'
                            break

                for _ in range(noOfC):
                    for i in range(len(list1)):
                        if list1[i]=='?':
                            list1[i]='C'
                            break

                for _ in range(noOfT):
                    for i in range(len(list1)):
                        if list1[i]=='?':
                            list1[i]='T'
                            break
            if list1.count('?')==0:
                print("".join(list1))
            else:
                print("===")
        else:
            print("===")
    elif index==3:
        remG=maxCount-countG
        remC=maxCount-countC
        remA=maxCount-countA

        temp=remG+remC+remA
        countSymb-=temp
        if countSymb>=0:
            for _ in range(remG):
                for i in range(len(list1)):
                    if list1[i]=='?':
                        list1[i]='G'
                        break

            for _ in range(remA):
                for i in range(len(list1)):
                    if list1[i]=='?':
                        list1[i]='A'
                        break

            for _ in range(remC):
                for i in range(len(list1)):
                    if list1[i]=='?':
                        list1[i]='C'
                        break
            countSymb2=list1.count('?')
            if countSymb2%4==0:
                noOfA=countSymb//4
                noOfG=countSymb//4
                noOfC=countSymb//4
                noOfT=countSymb//4

                for _ in range(noOfA):
                    for i in range(len(list1)):
                        if list1[i]=='?':
                            list1[i]='A'
                            break

                for _ in range(noOfG):
                    for i in range(len(list1)):
                        if list1[i]=='?':
                            list1[i]='G'
                            break

                for _ in range(noOfC):
                    for i in range(len(list1)):
                        if list1[i]=='?':
                            list1[i]='C'
                            break

                for _ in range(noOfT):
                    for i in range(len(list1)):
                        if list1[i]=='?':
                            list1[i]='T'
                            break
            if list1.count('?')==0:
                print("".join(list1))
            else:
                print("===")
        else:
            print("===")
