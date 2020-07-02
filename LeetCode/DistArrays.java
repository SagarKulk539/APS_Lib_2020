/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
Code by : Sagar Kulkarni
*/

class DistArrays {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d)
    {
        int flag,temp;
        int count=0;
        for(int i=0;i<arr1.length;i++)
        {
            flag=0;
            for(int j=0;j<arr2.length;j++)
            {
                temp=Math.abs(arr1[i]-arr2[j]);
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
