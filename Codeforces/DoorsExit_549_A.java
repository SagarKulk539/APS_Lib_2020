/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1143/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class DoorsExit_549_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        int count0=0,count1=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]==1)
                count1++;
            else
                count0++;
        }

        int tempCount0=0,tempCount1=0;
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
                tempCount1++;
            else
                tempCount0++;

            if(tempCount0==count0)
            {
                index=i;
                break;
            }
            if(tempCount1==count1)
            {
                index=i;
                break;
            }
        }

        System.out.println(index+1);
        sc.close();
    }
}
