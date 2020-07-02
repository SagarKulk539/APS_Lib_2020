'''
APS-2020
Problem Description, Input, Output : https://www.codechef.com/APRIL20B/problems/SQRDSUB
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    N=int(input())
    list1=[int(x) for x in input().split()]

    totalCount=0
    oddCount=0

    for i in range(len(list1)):
        if (list1[i]&1)==1:
            oddCount+=1
        else:
            if list1[i]%4==0:
                totalCount+=(oddCount*(oddCount+1))//2
                totalCount+=len(list1)-i
                totalCount+=oddCount*(len(list1)-i)
                oddCount=0
            else:
                j=i+1
                while j<len(list1):
                    if (list1[j]&1)==0:
                        break
                    j+=1

                totalCount+=(oddCount*(oddCount+1))//2
                totalCount+=len(list1)-j
                totalCount+=oddCount*(len(list1)-j)
                oddCount=0

    totalCount+=(oddCount*(oddCount+1))//2
    print(totalCount)
