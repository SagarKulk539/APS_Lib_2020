/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/sort-array-by-parity/
Code by : Sagar Kulkarni
*/

import java.util.*;

class SortArrayParity
{
    public int[] sortArrayByParity(int[] A)
    {
        ArrayList<Integer> listEven=new ArrayList<Integer>();
        ArrayList<Integer> listOdd=new ArrayList<Integer>();
        for(int i=0;i<A.length;i++)
        {
            if((A[i]&1)==0)
                listEven.add(A[i]);
            else
                listOdd.add(A[i]);
        }
        listEven.addAll(listOdd);
        int[] arr=new int[listEven.size()];
        for(int i=0;i<listEven.size();i++)
            arr[i]=listEven.get(i);
        return arr;
    }
}
