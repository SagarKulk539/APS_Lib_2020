/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1371/problem/C
Code by : Sagar Kulkarni
*/

import java.util.*;

public class CookieGuests_654_C
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            long v=sc.nextLong();
            long c=sc.nextLong();
            long n=sc.nextLong();
            long m=sc.nextLong();

            if(v+c<n+m)
                System.out.println("No");
            else
            {
                if(Math.min(v,c)<m)
                    System.out.println("No");
                else
                    System.out.println("Yes");
            }
        }
        sc.close();
    }
}
