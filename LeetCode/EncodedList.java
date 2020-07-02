/*
APS-2020
Problem Description, Input, Output : https://leetcode.com/problems/decompress-run-length-encoded-list/
Code by : Sagar Kulkarni
*/
import java.util.*;
class EncodedList {
    public int[] decompressRLElist(int[] nums)
    {
        ArrayList<Integer> al=new ArrayList<Integer>();

        for(int i=0;i<=nums.length-2;i+=2)
        {
            int freq=nums[i];
            int val=nums[i+1];

            for(int j=0;j<freq;j++)
            {
                al.add(val);
            }
        }

        int[] arr=new int[al.size()];

        for(int i=0;i<al.size();i++)
            arr[i]=al.get(i);

        return arr;
    }
}
