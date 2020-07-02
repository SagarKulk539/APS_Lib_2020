'''
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/split-a-string-in-balanced-strings/
Code by : Sagar Kulkarni
'''

class Solution:
    def balancedStringSplit(self, s: str) -> int:
        countR=0
        countL=0
        count=0
        s=s+'M'

        for i in range(len(s)):
            if countR==countL and (countR!=0 and countL!=0):
                #print(countR,countL,sep=" ")
                countR=0
                countL=0
                count+=1
                #print(count)
                if s[i]=='R':
                    countR+=1

                elif s[i]=='L':
                    countL+=1
                continue

            if s[i]=='R':
                countR+=1

            elif s[i]=='L':
                countL+=1
        return count
