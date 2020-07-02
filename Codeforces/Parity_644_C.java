/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1360/problem/C
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Parity_644_C
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];

            int countEven=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                if((arr[i]&1)==0)
                    countEven++;
            }

            if((countEven&1)==0)
                System.out.println("YES");
            else
            {
                int flag=0;
                Arrays.sort(arr);
                for(int i=0;i<n-1;i++)
                {
                    if(arr[i+1]-arr[i]==1)
                    {
                        flag=1;
                        break;
                    }
                }
                if(flag==1)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
        sc.close();
    }
}
