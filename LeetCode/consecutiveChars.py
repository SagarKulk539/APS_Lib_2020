'''
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/consecutive-characters/
Code by : Sagar Kulkarni
'''

class Solution:
    def maxPower(self, s: str) -> int:
        count=1
        maxCount=1
        for i in range(len(s)-1):
            if s[i]==s[i+1]:
                count+=1
            else:
                count=1
            if count>maxCount:
                maxCount=count
        return maxCount
