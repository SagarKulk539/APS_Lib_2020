'''
APS-2020
Problem Description, Input, Output : https://www.codechef.com/JAN21C/problems/DECODEIT
Code by : Sagar Kulkarni
'''

def getEncodedCharacter(str1):
    if str1=="0000":
        return 'a'
    elif str1=="0001":
        return 'b'
    elif str1=="0010":
        return 'c'
    elif str1=="0011":
        return 'd'
    elif str1=="0100":
        return 'e'
    elif str1=="0101":
        return 'f'
    elif str1=="0110":
        return 'g'
    elif str1=="0111":
        return 'h'
    elif str1=="1000":
        return 'i'
    elif str1=="1001":
        return 'j'
    elif str1=="1010":
        return 'k'
    elif str1=="1011":
        return 'l'
    elif str1=="1100":
        return 'm'
    elif str1=="1101":
        return 'n'
    elif str1=="1110":
        return 'o'
    elif str1=="1111":
        return 'p'

for _ in range(int(input())):
    n=int(input())
    str1=input()
    list1=list(str1)

    newStr=""
    for i in range(0,n,4):
        ch=getEncodedCharacter("".join(list1[i:i+4]))
        newStr+=ch

    print(newStr)
