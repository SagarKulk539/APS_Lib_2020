/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/contest/biweekly-contest-22/problems/find-the-distance-value-between-two-arrays/
Code by : Sagar Kulkarni
*/

class DistanceBetweenArray 
{
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) 
    {
        int count=0;
        for(int i=0;i<arr1.length;i++)
        {
            int flag=0; 
            for(int j=0;j<arr2.length;j++)
            {
                int temp=Math.abs(arr1[i]-arr2[j]);
                if(temp<=d)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                count++;
        }
        return count;
    }
}
