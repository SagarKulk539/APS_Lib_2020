'''
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/longest-common-prefix/
Code by : Sagar Kulkarni
'''

class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        res=[]
        minlength=1000
        el=""
        if len(strs)==1:
            return strs[0]
        for element in strs:
            if len(element)<minlength:
                minlength=len(element)
                el=element

        if len(el)==0:
            return ""

        k=strs.index(el)
        temp=list(strs[k])
        flag=0
        for i in range(len(temp)):
            for j in range(len(strs)):
                if j!=k:
                    if strs[j][i]==temp[i]:
                        flag=1
                    else:
                        flag=0
                        break
            if flag==0 and i==0:
                return ""
            if flag==1:
                print(i,j,temp[i])
                res.append(temp[i])
        return ("".join(res))
