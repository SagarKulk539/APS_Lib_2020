/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/find-lucky-integer-in-an-array/
Code by : Sagar Kulkarni
*/

class LuckyInteger 
{
    public int findLucky(int[] arr) 
    {
        int[] freq=new int[501];
        for(int i=0;i<arr.length;i++)
            freq[arr[i]]++;
        
        int flag=0,max=-1;
        for(int i=1;i<=500;i++)
        {
            if(freq[i]==i)
            {
                flag=1;
                if(freq[i]>max)
                    max=freq[i];
            }
        }
        if(flag==0)
            return -1;
        else
            return max;
    }
}
