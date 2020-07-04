/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/JULY20B/problems/ADAKING
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class ADAKING
{
    public static void main (String[] args) throws java.lang.Exception
    {
          Scanner sc=new Scanner(System.in);
          int T=sc.nextInt();
          for(int iter1=0;iter1<T;iter1++)
          {
              int k=sc.nextInt();
              int noOfDot=k-1;
              int noOfX=64-k;

              System.out.print('O');
              int count=1;
              while(true)
              {
                  while(noOfDot!=0)
                  {
                      if(count%8==0)
                          System.out.println();
                      System.out.print('.');
                      noOfDot--;
                      count++;
                  }

                  while(noOfX!=0)
                  {
                      if(count%8==0)
                          System.out.println();
                      System.out.print('X');
                      noOfX--;
                      count++;
                  }

                  if(noOfX==0 && noOfDot==0)
                      break;
              }
              System.out.println();
          }
          sc.close();
    }
}
