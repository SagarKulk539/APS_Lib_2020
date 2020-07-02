'''
APS-2020
Problem Description, Input, Output : https://leetcode.com/contest/biweekly-contest-29/problems/longest-subarray-of-1s-after-deleting-one-element/
Code by : Sagar Kulkarni
'''

class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        if nums.count(1)==len(nums):
            return len(nums)-1
        elif nums.count(0)==len(nums):
            return 0
        else:
            maxOnes=0
            
            for i in range(len(nums)):
                if nums[i]==0:
                    count1=0
                    for j in range(i-1,-1,-1):
                        if nums[j]==0:
                            break
                        else:
                            count1+=1
                            
                    for j in range(i+1,len(nums)):
                        if nums[j]==0:
                            break
                        else:
                            count1+=1
                    if count1>maxOnes:
                        maxOnes=count1
            
            return maxOnes
