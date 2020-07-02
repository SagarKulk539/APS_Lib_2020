/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Square_Beta_1_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long n,m,a;
        n=sc.nextLong();
        m=sc.nextLong();
        a=sc.nextLong();

        long l,b;
        l=n/a;
        b=m/a;

        if(n%a!=0)
            l++;
        if(m%a!=0)
            b++;

        System.out.println(l*b);
        sc.close();
    }
}
