/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/LTIME85B/problems/CHFMOT18
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class CHFMOT18
{
	public static void main (String[] args) throws java.lang.Exception
	{
		    Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            long s=sc.nextLong();
            long n=sc.nextLong();

            long count=0;

            if((s&1)==1)
            {
                s--;
                count=1;
            }

            if(n>s)
                n=s;

            if(n!=0)
            {
                count+=(s/n);
                if((s%n)!=0)
                    count++;
            }
            System.out.println(count);
        }
        sc.close();
	}
}
