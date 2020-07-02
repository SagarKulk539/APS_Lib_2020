/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/xor-operation-in-an-array/
Code by : Sagar Kulkarni
*/

class XORArray 
{
    public int xorOperation(int n, int start) 
    {
        int res=start;
        
        for(int i=1;i<n;i++)
            res^=start+(2*i);
        return res;
    }
}
