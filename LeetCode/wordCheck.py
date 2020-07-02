'''
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
Code by : Sagar Kulkarni
'''

import re

class Solution:
    def isPrefixOfWord(self, sentence: str, searchWord: str) -> int:
        list1=list(sentence.split(" "))
        for i in range(len(list1)):
            match=re.search("^"+searchWord,list1[i])
            if match:
                return i+1
        return -1
