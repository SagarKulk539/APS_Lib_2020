'''
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1303/problem/A
Code by : Sagar Kulkarni
'''

N=int(input())

for _ in range(0,N):
    list1=[]
    count=0
    str1=input()

    for i in range(0,len(str1)):
        list1.append(int(str1[i]))

    for i in range(0,len(list1)):
        if i!=len(list1)-1:
            if list1[i]==1 and (1 in list1[i+1:]):
                j=i+1
                #print(j)
                while True:
                    if j<len(list1):
                        if list1[j]==1:
                            break
                        else:
                            count+=1
                    else:
                        break
                    j+=1
    print(count)
