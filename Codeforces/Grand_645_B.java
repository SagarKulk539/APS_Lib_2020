/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1358/problem/B
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Grand_645_B
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            Arrays.sort(arr);

            int grandma=n;
            int i;
            for(i=n-1;i>=0;i--)
            {
                if(arr[i]<=grandma)
                    break;
                grandma--;
            }
            i++;
            System.out.println(i+1);
        }
        sc.close();
    }
}
