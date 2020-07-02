/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1342/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Zero_Edu_86_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            long x,y;
            x=sc.nextLong();
            y=sc.nextLong();

            long a,b;
            a=sc.nextLong();
            b=sc.nextLong();

            long amount,diff;
            if(b>(2*a))
                System.out.println(a*(x+y));
            else
            {
                if(x>y)
                {
                    diff=x-y;
                    amount=a*(x-y);
                    amount+=b*y;
                }
                else
                {
                    diff=y-x;
                    amount=a*(y-x);
                    amount+=b*x;
                }
                System.out.println(amount);
            }
        }
        sc.close();
    }
}
