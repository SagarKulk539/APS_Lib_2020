/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/MARCH20B/problems/CHPINTU
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class CHPINTU
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int iter1=0;iter1<T;iter1++)
        {
            int n,m;
            n=sc.nextInt();
            m=sc.nextInt();
            int[] fruitType=new int[m];
            int[] flagTable=new int[m];

            for(int i=0;i<m;i++)
                fruitType[i]=0;

            int[] fruit=new int[n];
            int[] price=new int[n];

            for(int i=0;i<n;i++)
                fruit[i]=sc.nextInt();

            for(int i=0;i<n;i++)
                price[i]=sc.nextInt();

            for(int i=0;i<n;i++)
            {
                fruitType[fruit[i]-1]+=price[i];
                flagTable[fruit[i]-1]=1;
            }

            List<Integer> arr=new ArrayList<Integer>();

            for(int i=0;i<m;i++)
            {
                if(flagTable[i]!=0)
                    arr.add(fruitType[i]);
            }

            System.out.println(Collections.min(arr));
        }

        sc.close();
    }
}
