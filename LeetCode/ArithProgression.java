/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/contest/weekly-contest-196/problems/can-make-arithmetic-progression-from-sequence/
Code by : Sagar Kulkarni
*/

class ArithProgression 
{
    public boolean canMakeArithmeticProgression(int[] arr) 
    {
        Arrays.sort(arr);
        long diff=arr[1]-arr[0];
        
        int flag=0;
        for(int i=2;i<arr.length;i++)
        {
            if(arr[i]-arr[i-1]!=diff)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            return true;
        else
            return false;
    }
}
