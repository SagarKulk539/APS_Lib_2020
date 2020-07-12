'''
APS-2020
Problem Description, Input, Output : https://leetcode.com/contest/biweekly-contest-30/problems/range-sum-of-sorted-subarray-sums/
Code by : Sagar Kulkarni
'''

class Solution:
    def rangeSum(self, nums: List[int], n: int, left: int, right: int) -> int:
        newList=[]
        for i in range(len(nums)):
            sum1=nums[i]
            newList.append(sum1)
            for j in range(i+1,len(nums)):
                sum1+=nums[j]
                newList.append(sum1)
        
        newList.sort()
        left-=1
        right-=1
        
        totalSum=0
        for i in range(left,right+1):
            totalSum+=newList[i]
        
        return totalSum%((10**9)+7)
                
