/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
Code by : Sagar Kulkarni
*/

class CurrNum
{
    public int[] smallerNumbersThanCurrent(int[] nums)
    {
        int[] arr=new int[nums.length];

        for(int i=0;i<nums.length;i++)
            arr[i]=0;

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]<nums[i])
                    arr[i]++;
            }
        }
        return arr;
    }
}
