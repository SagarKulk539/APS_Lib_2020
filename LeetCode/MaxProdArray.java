/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
Code by : Sagar Kulkarni
*/

class MaxProdArray
{
    public int maxProduct(int[] nums) 
    {
        int maxProduct=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(((nums[i]-1)*(nums[j]-1))>maxProduct)
                    maxProduct=(nums[i]-1)*(nums[j]-1);
            }
        }
        return maxProduct;
    }
}
