/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1368/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class PlusEqual_Global_8_A
{
    public static void main(String[] args)
    {
        Scanner  sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();

            if(a>n || b>n)
                System.out.println(0);
            else
            {
                int count=1;
                if(a>b)
                    b+=a;
                else
                    a+=b;
                while(a<=n && b<=n)
                {
                    if(a<b)
                        a+=b;
                    else
                        b+=a;
                    count++;
                }
                System.out.println(count);
            }
        }
        sc.close();
    }
}
