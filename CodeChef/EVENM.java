/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/JUNE20B/problems/EVENM
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class EVENM
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            int val=1;
            for(int i=0;i<n;i++)
            {
                if((i&1)==0)
                {
                    for(int j=0;j<n;j++)
                    {
                        System.out.print(val+" ");
                        val++;
                    }
                }
                else
                {
                    int temp=val+n-1;
                    for(int j=0;j<n;j++)
                    {
                        System.out.print(temp+" ");
                        temp--;
                    }
                    val+=n;
                }
                System.out.println();
            }
        }
        sc.close();
	}
}
