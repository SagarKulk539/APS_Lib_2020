/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
Code by : Sagar Kulkarni
*/

class EvenNumDigits 
{
    public int findNumbers(int[] nums)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int res=(int)Math.floor(Math.log10(nums[i])+1);
            if((res&1)==0)
                count++;
        }
        return count;
    }
}
