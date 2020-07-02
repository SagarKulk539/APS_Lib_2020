/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/sort-array-by-parity-ii/
Code by : Sagar Kulkarni
*/

class SortArrayByParity 
{
    public int[] sortArrayByParityII(int[] A) 
    {
        int[] result=new int[A.length];
        int evenIndex=0;
        int oddIndex=1;
        
        for(int i=0;i<A.length;i++)
        {
            if((A[i]&1)==1)
            {
                result[oddIndex]=A[i];
                oddIndex+=2;
            }
            else
            {
                result[evenIndex]=A[i];
                evenIndex+=2;
            }
        }
        return result;
    }
}
