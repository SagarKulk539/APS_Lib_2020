/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1420/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Cubes_Sort_672_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            long[] arr=new long[n];

            long prev=0,curr;
            int flag=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextLong();
                curr=arr[i];
                if(i!=0)
                {
                    if(prev<=curr)
                        flag=1;
                }
                prev=arr[i];
            }

            if(flag==0)
                System.out.println("NO");
            else
                System.out.println("YES");

        }
        sc.close();
    }
}
