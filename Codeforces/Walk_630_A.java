/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1332/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Walk_630_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();

            int x=sc.nextInt();
            int y=sc.nextInt();

            int x1=sc.nextInt();
            int y1=sc.nextInt();

            int x2=sc.nextInt();
            int y2=sc.nextInt();

            boolean walkPossible=true;

            if(a+b>0 && x1==x2)
                walkPossible=false;
            if(c+d>0 && y1==y2)
                walkPossible=false;

            if(b>a)
            {
                if(b-a>x2-x)
                    walkPossible=false;
            }
            else
            {
                if(a-b>x-x1)
                    walkPossible=false;
            }

            if(d>c)
            {
                if(d-c>y2-y)
                    walkPossible=false;
            }
            else
            {
                if(c-d>y-y1)
                    walkPossible=false;
            }

            if(walkPossible)
                System.out.println("Yes");
            else
                System.out.println("No");

        }
        sc.close();
    }
}
