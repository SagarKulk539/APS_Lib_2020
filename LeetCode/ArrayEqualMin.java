/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/contest/weekly-contest-202/problems/minimum-operations-to-make-array-equal/
Code by : Sagar Kulkarni
*/

class ArrayEqualMin
{    
    public int minOperations(int n) 
    {
        int[] arr=new int[n];
        int val=1;
        
        int midVal=0;
        if(n%2==0)
        {
            int val1=0,val2=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=val;
                if(i==(n/2)-1)
                    val1=val;
                if(i==n/2)
                    val2=val;
                val+=2;
            }
            midVal=(val1+val2)/2;
        }
        else
        {
            int val1=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=val;
                if(i==(n/2))
                    val1=val;
                val+=2;
            }
            midVal=val1;
        }
        
        int total=0;
        for(int i=0;i<=(n/2)-1;i++)
            total+=Math.abs(arr[i]-midVal);
            
        return total;
    }
}
