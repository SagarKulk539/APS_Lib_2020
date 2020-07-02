/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1333/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Artem_632_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int r,c;
            r=sc.nextInt();
            c=sc.nextInt();

            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    if(i==0 && j==0)
                        System.out.print("W");
                    else
                        System.out.print("B");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
