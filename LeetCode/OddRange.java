/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/contest/biweekly-contest-31/problems/count-odd-numbers-in-an-interval-range/
Code by : Sagar Kulkarni
*/

class OddRange 
{
    public int countOdds(int low, int high) 
    {
        int count=high-low+1;
        count/=2;
        if(low%2!=0 && high%2!=0)
            count++;
        return count;
    }
}
