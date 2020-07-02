'''
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/happy-number/
Code by : Sagar Kulkarni
'''

def getSquareSum(n):
        sum=0

        while n!=0:
            sum+=(n%10)*(n%10)
            n//=10
        return sum

class Solution:
    def isHappy(self, n: int) -> bool:
        list1=[]

        while n not in list1:
            list1.append(n)
            n=getSquareSum(n)
            if n==1:
                return True
        return False
