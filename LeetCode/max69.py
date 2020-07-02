'''
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/maximum-69-number/
Code by : Sagar Kulkarni
'''

class Solution:
    def maximum69Number (self, num: int) -> int:
        currMax=num
        str1=str(num)
        list1=list(str1)

        for i in range(len(str1)):
            list2=list1[:]
            if list2[i]=='6':
                list2[i]='9'
                print(list2)
                res=int("".join(list2))
                if res>currMax:
                    currMax=res
                continue

            elif list2[i]=='9':
                list2[i]='6'
                print(list2)
                res=int("".join(list2))
                if res>currMax:
                    currMax=res
                continue
        return currMax
