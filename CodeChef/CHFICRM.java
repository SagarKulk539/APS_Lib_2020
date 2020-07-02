/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/JUNE20B/problems/CHFICRM
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class CHFICRM
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();

            int[] arr=new int[n];
            int flag=0;

            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            int fiveCoins=0,tenCoins=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]==5)
                    fiveCoins++;
                else if(arr[i]==10)
                {
                    tenCoins++;
                    if(fiveCoins>=1)
                        fiveCoins--;
                    else
                    {
                        flag=1;
                        break;
                    }
                }
                else
                {
                    if(tenCoins>=1)
                        tenCoins--;
                    else if(fiveCoins>=2)
                        fiveCoins-=2;
                    else
                    {
                        flag=1;
                        break;
                    }
                }
            }
            if(flag==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
	}
}
