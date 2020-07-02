/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
Code by : Sagar Kulkarni
*/

class ReplaceArray 
{
    public int[] replaceElements(int[] arr)
    {
        int max;
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length-1;i++)
        {
            max=arr[i+1];
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>max)
                    max=arr[j];
            }
            res[i]=max;
        }
        res[res.length-1]=-1;
        return res;
    }
}
