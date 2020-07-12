'''
APS-2020
Problem Description, Input, Output : https://leetcode.com/contest/weekly-contest-197/problems/number-of-substrings-with-only-1s/
Code by : Sagar Kulkarni
'''

class Solution:
    def numSub(self, s: str) -> int:
        list1=list(s)
        
        totalCount=0
        i=0
        while i<len(list1):
            flag=0
            if list1[i]=='1':
                flag=1
                tempCount=1
                j=i+1
                while j<len(list1):
                    if list1[j]=='1':
                        tempCount+=1
                    else:
                        break
                    j+=1
                i=j
                tempVar=tempCount*(tempCount+1)
                tempVar//=2
                totalCount+=tempVar
            if flag==0:
                i+=1
        return totalCount%((10**9)+7)
