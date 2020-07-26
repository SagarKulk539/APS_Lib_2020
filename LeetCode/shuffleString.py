'''
APS-2020
Problem Description, Input, Output : https://leetcode.com/contest/weekly-contest-199/problems/shuffle-string/
Code by : Sagar Kulkarni
'''

class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        list2=[0 for i in range(len(indices))]
        
        for i in range(len(indices)):
            list2[indices[i]]=s[i]
        
        return "".join(list2)
