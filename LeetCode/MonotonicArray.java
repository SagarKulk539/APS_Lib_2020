/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/monotonic-array/
Code by : Sagar Kulkarni
*/

class MonotonicArray
{
    public boolean isMonotonic(int[] A)
    {
        if(A.length==1)
            return true;
        
        boolean monotonicIncreasing=false;
        boolean monotonicDecreasing=false;
        
        int flagInc=0;
        int flagDec=0;
        
        int falseFlag=0;
        
        for(int i=0;i<A.length-1;i++)
        {
            if(A[i]<A[i+1])
            {
                if(monotonicDecreasing==false)
                    monotonicIncreasing=true;
                else
                {
                    falseFlag=1;
                    break;
                }
                flagInc=1;
                
            }
            else if(A[i]>A[i+1])
            {
                if(monotonicIncreasing==false)
                    monotonicDecreasing=true;
                else
                {
                    falseFlag=1;
                    break;
                }
                flagDec=1;
            }
        }
        if(flagInc==0 && flagDec==0)
            return true;
        else
        {
            if(falseFlag==1)
                return false;
            else
                return true;
        }
    }
}
