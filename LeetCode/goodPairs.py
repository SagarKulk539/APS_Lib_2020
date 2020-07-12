'''
APS-2020
Problem Description, Input, Output : https://leetcode.com/contest/weekly-contest-197/problems/number-of-good-pairs/
Code by : Sagar Kulkarni
'''

class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        count=0
        for i in range(len(nums)-1):
            for j in range(i+1,len(nums)):
                if nums[i]==nums[j]:
                    count+=1
        return count
