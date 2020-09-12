/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1407/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class ZeroOneSum_669_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];

            int count0=0,count1=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                if(arr[i]==0)
                    count0++;
                else
                    count1++;
            }

            if(count0>=(n/2))
            {
                System.out.println(count0);
                for(int i=0;i<count0;i++)
                    System.out.print(0+" ");
                System.out.println();
            }
            else
            {
                if(count1%2!=0)
                    count1--;

                System.out.println(count1);
                for(int i=0;i<count1;i++)
                    System.out.print(1+" ");
                System.out.println();
            }
        }
        sc.close();
    }
}
