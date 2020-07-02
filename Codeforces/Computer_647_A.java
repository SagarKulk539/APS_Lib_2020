/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1362/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Computer_647_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();

            if(a==b)
                System.out.println(0);
            else
            {
                if(a>b)
                {
                    if((a/2)<b)
                        System.out.println(-1);
                    else
                    {
                        int flag=0;
                        long count=0;
                        while(true)
                        {
                            flag=0;
                            if(a==b)
                            {
                                flag=1;
                                break;
                            }
                            if(a<b)
                            {
                                flag=0;
                                break;
                            }
                            if(a%8==0 && flag==0 && (a/8)>=b)
                            {
                                a/=8;
                                flag=1;
                                count++;
                            }
                            if(a%4==0 && flag==0 && (a/4)>=b)
                            {
                                a/=4;
                                flag=1;
                                count++;
                            }
                            if(a%2==0 && flag==0 && (a/2)>=b)
                            {
                                a/=2;
                                flag=1;
                                count++;
                            }
                            if(flag==0)
                                break;
                        }
                        if(flag==0)
                            System.out.println(-1);
                        else
                            System.out.println(count);
                    }
                }
                else
                {
                    if((a*2)>b)
                        System.out.println(-1);
                    else
                    {
                        int flag=0;
                        long count=0;
                        while(true)
                        {
                            flag=0;
                            if(a==b)
                            {
                                flag=1;
                                break;
                            }
                            if(a>b)
                            {
                                flag=0;
                                break;
                            }
                            if((a*8)<=b && flag==0)
                            {
                                a*=8;
                                flag=1;
                                count++;
                            }
                            if((a*4)<=b && flag==0)
                            {
                                a*=4;
                                flag=1;
                                count++;
                            }
                            if((a*2)<=b && flag==0)
                            {
                                a*=2;
                                flag=1;
                                count++;
                            }
                            if(flag==0)
                                break;
                        }
                        if(flag==0)
                            System.out.println(-1);
                        else
                            System.out.println(count);
                    }
                }
            }
        }
        sc.close();
    }
}
