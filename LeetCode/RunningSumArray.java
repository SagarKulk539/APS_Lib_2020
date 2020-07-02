/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/running-sum-of-1d-array/
Code by : Sagar Kulkarni
*/

class RunningSumArray 
{
    public int[] runningSum(int[] nums) 
    {    
        int[] arr=new int[nums.length];
        int runningSum=0;
        
        for(int i=0;i<nums.length;i++)
        {
            runningSum+=nums[i];
            arr[i]=runningSum;
        }
        return arr;
    }
}
