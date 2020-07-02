/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/shuffle-the-array/
Code by : Sagar Kulkarni
*/

class ShuffleArray
{
    public int[] shuffle(int[] nums, int n)
    {
        int[] arr=new int[2*n];
        for(int i=0,j=0;i<n;i++,j+=2)
            arr[j]=nums[i];

        for(int i=n,j=1;i<nums.length;i++,j+=2)
            arr[j]=nums[i];

        return arr;
    }
}
