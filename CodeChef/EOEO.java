/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/JUNE20B/problems/EOEO
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class EOEO
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            long ts=sc.nextLong();
            while((ts&1)==0)
                ts/=2;
            System.out.println(ts/2);
        }
        sc.close();
	}
}
