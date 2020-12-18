/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/problems/EVENPSUM
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;


class EVENPSUM
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0;k<t;k++)
        {
            long a,b;
            a=sc.nextLong();
            b=sc.nextLong();

            long oddA,evenA;

            oddA=evenA=a/2;

            if(a%2!=0)
                oddA+=1;

            long oddB,evenB;

            oddB=evenB=b/2;

            if(b%2!=0)
                oddB+=1;

            System.out.println((oddA*oddB)+(evenA*evenB));
        }
        sc.close();
	}
}
