/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/COOK121B/problems/CHEFNWRK
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class CHEFNWRK
{
	public static void main (String[] args) throws java.lang.Exception
	{
		  Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();

      for(int j=0;j<t;j++)
      {
          int n,k;
          n=sc.nextInt();
          k=sc.nextInt();

          long[] arr=new long[n];
          for(int i=0;i<n;i++)
              arr[i]=sc.nextLong();

          long sum=0;
          int moves=0;
          for(int i=0;i<n;i++)
          {
              if(arr[i]<=k)
              {
                  sum+=arr[i];
                  if(sum>k)
                  {
                      moves++;
                      i-=1;
                      sum=0;
                  }
              }
              else
              {
                  sum=0;
                  break;
              }
          }

          if(sum==0)
              System.out.println(-1);
          else
              System.out.println(moves+1);
      }
      sc.close();
	}
}
