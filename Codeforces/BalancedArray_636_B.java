/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1343/problem/B
Code by : Sagar Kulkarni
*/

import java.util.*;

public class BalancedArray_636_B
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            if(((n/2)&1)==1 || n<=2)
            {
                System.out.println("NO");
                continue;
            }
            else
            {
                int[] arr=new int[n];
                int sumEven=0,sumOdd=0;
                for(int i=0,j=2;i<(n/2);i++,j+=2)
                {
                    arr[i]=j;
                    sumEven+=arr[i];
                }
                for(int i=(n/2),j=1;i<n-1;i++,j+=2)
                {
                    arr[i]=j;
                    sumOdd+=arr[i];
                }
                int temp=sumEven-sumOdd;
                if((temp&1)==1)
                {
                    arr[n-1]=temp;
                    System.out.println("YES");
                    for(int i=0;i<n;i++)
                        System.out.print(arr[i]+" ");
                    System.out.println();
                }
                else
                    System.out.println("NO");
            }
        }
        sc.close();
    }
}
