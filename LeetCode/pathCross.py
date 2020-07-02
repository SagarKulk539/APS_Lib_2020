'''
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/path-crossing/
Code by : Sagar Kulkarni
'''

class Solution:
    def isPathCrossing(self, path: str) -> bool:
        list1=list(path)
        list2=['0,0']
        
        x=0
        y=0
        
        flag=0
        
        for i in range(len(list1)):
            if list1[i]=='N':
                y+=1
            elif list1[i]=='S':
                y-=1
            elif list1[i]=='E':
                x+=1
            elif list1[i]=='W':
                x-=1
            
            str1=str(x)+","+str(y)
            if str1 not in list2:
                list2.append(str1)
            else:
                flag=1
                break
        if flag==1:
            return True
        else:
            return False
