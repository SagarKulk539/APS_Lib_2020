/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1353/problem/B
Code by : Sagar Kulkarni
*/

import java.util.*;

public class ArraySwap_642_B
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        for(int iter1=0;iter1<q;iter1++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();

            int[] a=new int[n];
            int[] b=new int[n];

            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            for(int i=0;i<n;i++)
                b[i]=sc.nextInt();

            Arrays.sort(a);
            Arrays.sort(b);

            int iteration=0;
            int indexA=0;
            int indexB=n-1;
            int temp;
            int flag=0;
            while(iteration<k)
            {
                if(indexA<n && indexB>=0)
                {
                    if(a[indexA]<b[indexB])
                    {
                        temp=a[indexA];
                        a[indexA]=b[indexB];
                        b[indexB]=temp;
                        indexA++;
                        indexB--;
                    }
                    else
                        flag=1;
                }
                else
                    break;
                if(flag==1)
                    break;
                iteration++;
            }

            int sum=0;
            for(int i=0;i<n;i++)
                sum+=a[i];
            System.out.println(sum);
        }
        sc.close();
    }
}
