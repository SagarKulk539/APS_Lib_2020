/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1365/problem/B
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Trouble_648_B
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];

            boolean sorted=true;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(i>=1 && a[i]<a[i-1])
                    sorted=false;
            }

            boolean have0=false,have1=false;
            for(int i=0;i<n;i++)
            {
                b[i]=sc.nextInt();
                if(b[i]==0)
                    have0=true;
                if(b[i]==1)
                    have1=true;
            }

            if(sorted)
                System.out.println("Yes");
            else if(have0 && have1)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        sc.close();
    }
}
