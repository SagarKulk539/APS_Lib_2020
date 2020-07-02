/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1364/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class XXXXX_649_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();

            int[] arr=new int[n];
            long sum=0;

            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }

            if(sum%x!=0)
                System.out.println(n);
            else
            {
                int i;
                for(i=0;i<n;i++)
                {
                    if(arr[i]%x!=0)
                        break;
                }

                int j;
                for(j=n-1;j>=0;j--)
                {
                    if(arr[j]%x!=0)
                        break;
                }

                j=n-1-j;
                int temp=Math.min(i,j);
                System.out.println(n-temp-1);
            }
        }
        sc.close();
    }
}
