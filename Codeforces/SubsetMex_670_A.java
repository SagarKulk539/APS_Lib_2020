/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1406/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class SubsetMex_670_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            int[] freq=new int[101];

            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                freq[arr[i]]++;
            }

            int flag=0,sum=0;
            for(int i=0;i<101;i++)
            {
                if(flag==0 && freq[i]==0)
                {
                    sum+=2*i;
                    break;
                }
                else if(freq[i]<=1)
                {
                    if(flag==0)
                    {
                        sum+=i;
                        flag=1;
                    }
                    else if(flag==1 && freq[i]==0)
                    {
                        sum+=i;
                        break;
                    }
                }
            }

            System.out.println(sum);
        }
        sc.close();
    }
}
