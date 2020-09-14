/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/SEPT20B/problems/TREE2
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class TREE2
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
      long t=sc.nextLong();
      for(long k=0;k<t;k++)
      {
          long n=sc.nextLong();
          long[] arr=new long[(int)n];
          long temp;

          ArrayList<Long> list=new ArrayList<Long>();
          for(long i=0;i<n;i++)
              arr[(int)i]=sc.nextLong();

          Arrays.sort(arr);

          for(long i=0;i<n;i++)
          {
              if(list.size()==0)
              {
                  if(arr[(int)i]!=0)
                      list.add(arr[(int)i]);
              }
              else
              {
                  if(arr[(int)i]!=0 && list.get(list.size()-1)!=arr[(int)i])
                      list.add(arr[(int)i]);
              }
          }

          System.out.println(list.size());
      }
      sc.close();
	}
}
