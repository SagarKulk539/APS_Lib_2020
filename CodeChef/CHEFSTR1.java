/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/JULY20B/problems/CHEFSTR1
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class CHEFSTR1
{
    public static void main (String[] args) throws java.lang.Exception
    {
          Scanner sc=new Scanner(System.in);
          int T=sc.nextInt();
          for(int iter1=0;iter1<T;iter1++)
          {
              int n=sc.nextInt();
              int prev,curr;
              long totalMoves=0;

              prev=sc.nextInt();
              for(int i=1;i<n;i++)
              {
                  curr=sc.nextInt();
                  totalMoves+=Math.abs(curr-prev);
                  totalMoves-=1;
                  prev=curr;

              }
              System.out.println(totalMoves);
          }
          sc.close();
    }
}
