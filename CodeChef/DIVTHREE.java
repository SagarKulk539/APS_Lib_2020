/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/JAN21C/problems/DIVTHREE
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
        int t=sc.nextInt();

        for(int j=0;j<t;j++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int d=sc.nextInt();

            long sum=0;
            int temp;
            for(int i=0;i<n;i++)
            {
                temp=sc.nextInt();
                sum+=temp;
            }

            int maxContests=(int)(sum/k);
            if(maxContests>d)
                System.out.println(d);
            else
                System.out.println(maxContests);
        }
        sc.close();
    }
}
