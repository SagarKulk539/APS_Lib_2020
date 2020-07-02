'''
APS-2020
Problem Description, Input, Output : https://www.codechef.com/COOK119B/problems/CACHEHIT
Code by : Sagar Kulkarni
'''

for _ in range(int(input())):
    n,b,m=map(int,input().split())
    list1=[int(x) for x in input().split()]

    blockLoad=1
    fixedVal=list1[0]%b

    val1=fixedVal
    val1-=1
    tempList1=[]
    tempInsert1=list1[0]
    while val1>=0:
        tempInsert1-=1
        tempList1.append(tempInsert1)
        val1-=1
    tempList1.reverse()
    tempList1.append(list1[0])

    val2=fixedVal
    val2+=1
    tempList2=[]
    tempInsert2=list1[0]
    while val2<b:
        tempInsert2+=1
        tempList2.append(tempInsert2)
        val2+=1

    tempList1.extend(tempList2)
    for i in range(1,len(list1)):
        if list1[i] not in tempList1:
            blockLoad+=1
            fixedVal=list1[i]%b

            val1=fixedVal
            val1-=1
            tempList1=[]
            tempInsert1=list1[i]
            while val1>=0:
                tempInsert1-=1
                tempList1.append(tempInsert1)
                val1-=1
            tempList1.reverse()
            tempList1.append(list1[i])

            val2=fixedVal
            val2+=1
            tempList2=[]
            tempInsert2=list1[i]
            while val2<b:
                tempInsert2+=1
                tempList2.append(tempInsert2)
                val2+=1

            tempList1.extend(tempList2)
    print(blockLoad)
