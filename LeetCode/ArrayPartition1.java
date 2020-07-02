/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/array-partition-i/
Code by : Sagar Kulkarni
*/

import java.util.*;

class ArrayPartition1
{
    public int arrayPairSum(int[] nums)
    {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<=nums.length-2;i+=2)
            sum+=Math.min(nums[i],nums[i+1]);
        return sum;
    }
}
