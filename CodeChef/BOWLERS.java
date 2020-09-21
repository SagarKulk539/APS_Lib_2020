/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/problems/BOWLERS
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class BOWLERS
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int m=0;m<t;m++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int l=sc.nextInt();

            if(k*l<n)
                System.out.println(-1);
            else
            {
                if(k==1 && n>1)
                    System.out.println(-1);
                else
                {
                    int bowler=0;
                    for(int i=0;i<n;i++)
                    {
                        System.out.print(bowler+1+" ");
                        bowler=(bowler+1)%k;
                    }
                    System.out.println();
                }
            }
        }
        sc.close();
	}
}
