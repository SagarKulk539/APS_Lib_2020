/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/contest/weekly-contest-200/problems/count-good-triplets
Code by : Sagar Kulkarni
*/

class GoodTriplets 
{    
    public int countGoodTriplets(int[] arr, int a, int b, int c) 
    {
        int goodTriplets=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c)
                        goodTriplets++;
                }
            }
        }
        return goodTriplets;
    }
}
