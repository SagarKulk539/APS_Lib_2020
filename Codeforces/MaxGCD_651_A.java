/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1370/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class MaxGCD_651_A
{
    public static int computeGCD(int a,int b)
    {
        if(b==0)
            return a;
        return computeGCD(b,a%b);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            if((n&1)==1)
            {
                int a=n-1;
                int b=(n-1)/2;
                System.out.println(computeGCD(a,b));
            }
            else
            {
                int a=n;
                int b=n/2;
                System.out.println(computeGCD(a,b));
            }
        }
        sc.close();
    }
}
