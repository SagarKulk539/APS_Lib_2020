/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1324/problem/B
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Palindrome_627_B
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T;
        T=scan.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int N;
            N=scan.nextInt();
            int[] arr=new int[N];

            for(int i=0;i<N;i++)
                arr[i]=scan.nextInt();

            int flag=0;
            for(int i=0;i<=N-3;i++)
            {
                if(flag==1)
                    break;
                for(int j=i+1;j<N;j++)
                {
                    if(j-i>1)
                    {
                        if(arr[i]==arr[j])
                            flag=1;
                    }
                }
            }

            if(flag==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        scan.close();
    }
}
