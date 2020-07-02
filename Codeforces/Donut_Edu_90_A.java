/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1373/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Donut_Edu_90_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();

            if(a>=c)
                System.out.println(-1+" "+b);
            else
            {
                System.out.print(1+" ");
                long cost1=b*a;
                if(cost1>c)
                    System.out.println(b);
                else
                    System.out.println(-1);
            }
        }
        sc.close();
    }
}
