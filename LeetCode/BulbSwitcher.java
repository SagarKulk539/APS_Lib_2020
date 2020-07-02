/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/bulb-switcher/
Code by : Sagar Kulkarni
*/

class BulbSwitcher 
{
    public int bulbSwitch(int n)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n==2)
            return 1;
        int i=3;
        int count=0,sum=i;
        while(sum<n)
        {
            count++;
            i+=2;
            sum+=i;
        }
        count+=1;
        return count;
    }
}
