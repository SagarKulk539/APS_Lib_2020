'''
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/group-anagrams/
Code by : Sagar Kulkarni
'''

from itertools import permutations
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        sortedList=[]
        for elem in strs:
            templist=list(elem)
            templist.sort()
            str1=str("".join(templist))
            if str1 not in sortedList:
                sortedList.append(str1)

        list2=[]
        for _ in range(len(sortedList)):
            list2.append([])

        for elem in strs:
            templist=list(elem)
            templist.sort()
            str1=str("".join(templist))
            list2[sortedList.index(str1)].append(elem)

        return list2
