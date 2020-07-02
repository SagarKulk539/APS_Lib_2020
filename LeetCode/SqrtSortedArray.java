/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/squares-of-a-sorted-array/
Code by : Sagar Kulkarni
*/

import java.util.*;

class SqrtSortedArray
{
    public int[] sortedSquares(int[] A)
    {
        int[] arr=new int[A.length];
        for(int i=0;i<A.length;i++)
            arr[i]=A[i]*A[i];
        Arrays.sort(arr);
        return arr;
    }
}
