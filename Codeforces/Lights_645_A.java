/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1358/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Lights_645_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();

            if(n==1 && m==1)
                System.out.println(1);
            else if((m&1)==0)
            {
                int tmp=m/2;
                System.out.println(tmp*n);
            }
            else
            {
                int res;
                int nby2=n/2;
                int mby2=m/2;
                if((n&1)==0)
                {
                    res=(mby2*n)+nby2;
                    System.out.println(res);
                }
                else
                {
                    res=(mby2*n)+(nby2+1);
                    System.out.println(res);
                }
            }
        }
        sc.close();
    }
}
