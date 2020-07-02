/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1367/problem/B
Code by : Sagar Kulkarni
*/

import java.util.*;

public class EvenArray_650_B
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];

            int zeroes=0,ones=0;
            if((n&1)==1)
            {
                zeroes=(n/2)+1;
                ones=n/2;
            }
            else
            {
                zeroes=n/2;
                ones=n/2;
            }

            int odd=0,even=0;
            int mismatchCount=0;

            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                if((i%2)!=(arr[i]%2))
                    mismatchCount++;
                if((arr[i]&1)==1)
                    odd++;
                else
                    even++;
            }

            if(even==zeroes && odd==ones)
                System.out.println(mismatchCount/2);
            else
                System.out.println(-1);
        }

        sc.close();
    }
}
