'''
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/
Code by : Sagar Kulkarni
'''

class Solution:
    def hasGroupsSizeX(self, deck: List[int]) -> bool:
        if len(deck)==1:
            return False
        elif len(deck)==2:
            if deck[0]==deck[1]:
                return True
            else:
                return False

        list2=[]
        prev=-99
        for elem in deck:
            if elem not in list2:
                list2.append(elem)
                if prev==-99:
                    prev=deck.count(elem)
                else:
                    tmp=math.gcd(prev,deck.count(elem))
                    prev=deck.count(elem)
                    if tmp==1:
                        return False
        return True
