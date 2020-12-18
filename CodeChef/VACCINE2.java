/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/problems/VACCINE2
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;


class VACCINE2
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0;k<t;k++)
        {
            int n,d;
            n=sc.nextInt();
            d=sc.nextInt();

            int[] arr=new int[n];

            int risk=0,notRisk=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                if(arr[i]>=80 || arr[i]<=9)
                    risk++;
                else
                    notRisk++;
            }

            int days1=risk/d;
            if(days1*d!=risk)
                days1++;

            int days2=notRisk/d;
            if(days2*d!=notRisk)
                days2++;

            System.out.println(days1+days2);
        }
        sc.close();
	}
}
