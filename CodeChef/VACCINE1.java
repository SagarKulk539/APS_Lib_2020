/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/JULY20B/problems/ADAKING
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
        int d1,v1,d2,v2,p;

        d1=sc.nextInt();
        v1=sc.nextInt();
        d2=sc.nextInt();
        v2=sc.nextInt();
        p=sc.nextInt();

        int totalDays=Math.min(d1,d2)-1;
        int totalProduced=0;

        int absVal=Math.abs(d1-d2);

        if(d1<d2)
        {
            int i=0;
            while(totalProduced<p && i<d2-d1)
            {
                totalProduced+=v1;
                totalDays++;
                i++;
            }
        }
        else
        {
            int i=0;
            while(totalProduced<p && i<d1-d2)
            {
                totalProduced+=v2;
                totalDays++;
                i++;
            }
        }

        if(totalProduced>=p)
            System.out.println(totalDays);
        else
        {
            while(totalProduced<p)
            {
                totalDays++;
                totalProduced+=v1+v2;
            }
            System.out.println(totalDays);
        }
        sc.close();
	}
}
