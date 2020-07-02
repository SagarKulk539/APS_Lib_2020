/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/create-target-array-in-the-given-order/
Code by : Sagar Kulkarni
*/

class TargetArray
{
    public int[] createTargetArray(int[] nums, int[] index)
    {
        int[] targetArray=new int[nums.length];
        for(int i=0;i<targetArray.length;i++)
            targetArray[i]=-1;

        for(int i=0;i<nums.length;i++)
        {
            if(targetArray[index[i]]==-1)
                targetArray[index[i]]=nums[i];
            else
            {
                for(int j=targetArray.length-1;j>index[i];j--)
                {
                    targetArray[j]=targetArray[j-1];
                }
                targetArray[index[i]]=nums[i];
            }
        }

        return targetArray;
    }
}
