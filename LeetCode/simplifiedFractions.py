'''
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/simplified-fractions/
Code by : Sagar Kulkarni
'''

import math

class Solution: 
    def simplifiedFractions(self, n: int) -> List[str]:
        if n==1:
            return []
        list1=[]
        for i in range(1,n):
            for j in range(i+1,n+1):
                if i==1:
                    tmp=str(i)+"/"+str(j)
                    list1.append(tmp)
                else:
                    if math.gcd(i,j)==1:
                        tmp=str(i)+"/"+str(j)
                        list1.append(tmp)
        return list1
