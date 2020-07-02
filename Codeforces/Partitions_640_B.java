/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1352/problem/B
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Partitions_640_B
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();

            if(k>n)
            {
                System.out.println("NO");
                continue;
            }
            if((n&1)==1)
            {
                if((k&1)==0)
                    System.out.println("NO");
                else
                {
                    System.out.println("YES");
                    int i;
                    for(i=0;i<k-1;i++)
                        System.out.print(1+" ");
                    System.out.println(n-(i*1));

                }
            }
            else
            {
                if((k&1)==0)
                {
                    System.out.println("YES");
                    int i;
                    for(i=0;i<k-1;i++)
                        System.out.print(1+" ");
                    System.out.println(n-(i*1));
                }
                else
                {
                    if((n/2)<k)
                        System.out.println("NO");
                    else
                    {
                        System.out.println("YES");
                        int i;
                        for(i=0;i<k-1;i++)
                            System.out.print(2+" ");
                        System.out.println(n-(i*2));
                    }
                }
            }
        }
        sc.close();
    }
}
