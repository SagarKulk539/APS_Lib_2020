/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1409/problem/B
Code by : Sagar Kulkarni
*/

import java.util.*;

public class MinProduct_667_B
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        for(long k=0;k<t;k++)
        {
            long a,b,x,y,n;
            a=sc.nextLong();
            b=sc.nextLong();
            x=sc.nextLong();
            y=sc.nextLong();
            n=sc.nextLong();

            long backupa=a;
            long backupb=b;
            long backupn=n;

            long temp1=Math.min(Math.abs(a-x),n);
            a-=temp1;
            n-=temp1;
            b-=n;

            if(a<x)
                a=x;
            if(b<y)
                b=y;

            long ans1=a*b;

            a=backupa;
            b=backupb;
            n=backupn;

            long temp2=Math.min(Math.abs(b-y),n);
            b-=temp2;
            n-=temp2;
            a-=n;

            if(a<x)
                a=x;
            if(b<y)
                b=y;

            long ans2=a*b;

            System.out.println(Math.min(ans1,ans2));

        }
        sc.close();
    }
}
