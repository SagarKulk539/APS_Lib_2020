/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/JULY20B/problems/PTMSSNG
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class PTMSSNG
{
    public static void main (String[] args) throws java.lang.Exception
    {
          Scanner sc=new Scanner(System.in);
          int T=Integer.parseInt(sc.next());
          for(int iter1=0;iter1<T;iter1++)
          {
              long n=Long.parseLong(sc.next());

              HashMap<Long,Long> mapX=new HashMap<Long,Long>();
              HashMap<Long,Long> mapY=new HashMap<Long,Long>();

              for(long i=0;i<(4*n)-1;i++)
              {
                  long x=Long.parseLong(sc.next());
                  long y=Long.parseLong(sc.next());

                  if(mapX.containsKey(x))
                  {
                      long temp=mapX.get(x);
                      temp+=1;
                      mapX.replace(x,temp);
                  }

                  if(!mapX.containsKey(x))
                      mapX.put(x,(long)1);

                  if(mapY.containsKey(y))
                  {
                      long temp=mapY.get(y);
                      temp+=1;
                      mapY.replace(y,temp);
                  }

                  if(!mapY.containsKey(y))
                      mapY.put(y,(long)1);
              }

              long finalX=0;
              for(Long key : mapX.keySet())
              {
                  long temp=mapX.get(key);
                  if(temp%2!=0)
                  {
                      finalX=key;
                      break;
                  }
              }

              long finalY=0;
              for(Long key : mapY.keySet())
              {
                  long temp=mapY.get(key);
                  if(temp%2!=0)
                  {
                      finalY=key;
                      break;
                  }
              }
              System.out.println(finalX+" "+finalY);
          }
          sc.close();
    }
}
