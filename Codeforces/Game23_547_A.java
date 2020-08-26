/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1141/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Game23_547_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long n,m;
        n=sc.nextLong();
        m=sc.nextLong();

        if(m%n==0)
        {
            int flag=0;

            long x=0,y=0;
            long temp=m/n;
            while(temp%2==0)
            {
                temp/=2;
                x++;
            }
            temp=m/n;
            while(temp%3==0)
            {
                temp/=3;
                y++;
            }
            temp=m/n;
            long div=(long)Math.pow(2,x)*(long)Math.pow(3,y);
            temp/=div;
            if(temp!=1)
                flag=1;

            if(flag==0)
                System.out.println(x+y);
            else
                System.out.println(-1);
        }
        else
            System.out.println(-1);
        sc.close();
    }
}
