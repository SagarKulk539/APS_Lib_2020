/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/MAY20B/problems/COVID19
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class COVID19
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            ArrayList<Integer> list=new ArrayList<Integer>();
            int temp,counter=1;
            for(int i=0;i<arr.length-1;i++)
            {
                temp=Math.abs(arr[i]-arr[i+1]);
                if(temp<=2)
                    counter++;
                else
                {
                    list.add(counter);
                    counter=1;
                }
            }
            list.add(counter);
            Collections.sort(list);
            System.out.println(list.get(0)+" "+list.get(list.size()-1));
        }
        sc.close();
	}
}
