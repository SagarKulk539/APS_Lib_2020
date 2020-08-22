'''
APS-2020
Problem Description, Input, Output : https://leetcode.com/contest/biweekly-contest-33/problems/thousand-separator/
Code by : Sagar Kulkarni
'''

class Solution:
    def thousandSeparator(self, n: int) -> str:
        str1=str(n)
        list1=list(str1)
        list1.reverse()
        
        list2=[]
        count=0
        for i in range(len(list1)):
            count+=1
            if count==3:
                count=0
                list2.append(list1[i])
                list2.append('.')
            else:
                list2.append(list1[i])
        if list2[-1]=='.':
            list2.pop()
        list2.reverse()
        return "".join(list2)
        
        
