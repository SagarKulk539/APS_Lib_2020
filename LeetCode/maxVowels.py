'''
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/-sentence/
Code by : Sagar Kulkarni
'''

class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        maxVowelCount=0
        currRunningCount=0
        for i in range(len(s)):
            if s[i]=='a' or s[i]=='e' or s[i]=='i' or s[i]=='o' or s[i]=='u':
                currRunningCount+=1
            if i >= (k-1):
                maxVowelCount=max(maxVowelCount,currRunningCount)
                if s[i-(k-1)]=='a' or s[i-(k-1)]=='e' or s[i-(k-1)]=='i' or s[i-(k-1)]=='o' or s[i-(k-1)]=='u':
                    currRunningCount-=1
        return maxVowelCount
