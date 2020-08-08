/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/contest/biweekly-contest-32/problems/kth-missing-positive-number/
Code by : Sagar Kulkarni
*/

class KMissing 
{
    public int findKthPositive(int[] arr, int k) 
    {
        int[] tempArr=new int[2001];
        for(int i=0;i<arr.length;i++)
            tempArr[arr[i]]=1;
        
        int count=0,res=0;
        for(int i=1;i<=2000;i++)
        {
            if(tempArr[i]==0)
            {
                count++;
                if(count==k)
                {
                    res=i;
                    break;
                }
            }
        }
        return res;
    }
}
