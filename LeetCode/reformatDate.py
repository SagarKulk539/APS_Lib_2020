'''
APS-2020
Problem Description, Input, Output : https://leetcode.com/contest/biweekly-contest-30/problems/reformat-date/
Code by : Sagar Kulkarni
'''

class Solution:
    def reformatDate(self, date: str) -> str:
        month=["Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"]
        str1=date.split()
        list1=list(str1)
        
        if len(list1[0])==3:
            list1[0]='0'+list1[0][0]
        else:
            list1[0]=list1[0][:2]
            
        index=month.index(list1[1])
        index+=1
        if index<10:
            newStr='0'+str(index)
            list1[1]=newStr
        else:
            list1[1]=str(index)
        
        list1.reverse()
        return "-".join(list1)
