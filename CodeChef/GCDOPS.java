/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/LTIME88B/problems/GCDOPS
Code by : Sagar Kulkarni
*/

import java.util.*;

public class GCDOPS
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            long[] bArr=new long[n];

            int flag=0;
            for(int i=0;i<n;i++)
            {
                bArr[i]=sc.nextLong();
                if(((i+1)%bArr[i])!=0)
                    flag=1;
            }

            if(flag==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
