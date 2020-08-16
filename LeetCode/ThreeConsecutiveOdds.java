/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/contest/weekly-contest-202/problems/three-consecutive-odds/
Code by : Sagar Kulkarni
*/

class ThreeConsecutiveOdds 
{
    public boolean threeConsecutiveOdds(int[] arr) 
    {
        boolean isPresent=false;
        for(int i=0;i<arr.length-2;i++)
        {
            if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0)
            {
                isPresent=true;
                break;
            }
        }
        return isPresent;
    }
}
