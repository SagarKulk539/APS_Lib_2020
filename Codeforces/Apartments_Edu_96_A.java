/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1430/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Apartments_Edu_96_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();

            if(n==1 || n==2 || n==4)
            {
                System.out.println(-1);
                continue;
            }

            int rem=n%7;
            n=n/7;

            if(rem==0)
                System.out.println("0 0 "+n);
            else if(rem==1)
                System.out.println("1 1 "+(n-1));
            else if(rem==2)
                System.out.println("3 0 "+(n-1));
            else if(rem==3)
                System.out.println("1 0 "+n);
            else if(rem==4)
                System.out.println("2 1 "+(n-1));
            else if(rem==5)
                System.out.println("0 1 "+n);
            else if(rem==6)
                System.out.println("2 0 "+n);
        }
        sc.close();
    }
}
