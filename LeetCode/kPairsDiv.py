'''
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/check-if-array-pairs-are-divisible-by-k/
Code by : Sagar Kulkarni
'''

class Solution:
    def canArrange(self, arr: List[int], k: int) -> bool:
        if sum(arr)%k==0:
            return True
        else:
            return False
