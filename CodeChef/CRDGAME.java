/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/JULY20B/problems/CRDGAME
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class CRDGAME
{
    public static long powerFinder(long var)
    {
        long res=0;

        while(var!=0)
        {
            res+=var%10;
            var/=10;
        }

        return res;
    }
    
    public static void main (String[] args) throws java.lang.Exception
    {
          Scanner sc=new Scanner(System.in);
          int T=sc.nextInt();
          for(int iter1=0;iter1<T;iter1++)
          {
              int n=sc.nextInt();
              long a,b;
              int pointsChef=0,pointsMorty=0;

              for(int i=0;i<n;i++)
              {
                  a=sc.nextLong();
                  b=sc.nextLong();
                  long tempA=powerFinder(a);
                  long tempB=powerFinder(b);

                  if(tempA>tempB)
                      pointsChef++;
                  else if(tempB>tempA)
                      pointsMorty++;
                  else
                  {
                      pointsChef++;
                      pointsMorty++;
                  }
              }

              if(pointsChef>pointsMorty)
                  System.out.println(0+" "+pointsChef);
              else if(pointsMorty>pointsChef)
                  System.out.println(1+" "+pointsMorty);
              else
                  System.out.println(2+" "+pointsChef);
          }
          sc.close();
    }
}
