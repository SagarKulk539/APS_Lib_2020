/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/SEPT20B/problems/ADAMAT
Code by : Sagar Kulkarni
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class ADAMAT
{
    public static void transposeMatrix(int[][] mat,int L)
    {
        int[][] temp=new int[L+1][L+1];

        for(int i=1;i<=L;i++)
        {
            for(int j=1;j<=L;j++)
                temp[i][j]=mat[j][i];
        }

        for(int i=1;i<=L;i++)
        {
            for(int j=1;j<=L;j++)
                mat[i][j]=temp[i][j];
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();

      for(int k=0;k<t;k++)
      {
          int n=sc.nextInt();
          int[][] mat=new int[n+1][n+1];

          for(int i=1;i<=n;i++)
          {
              for(int j=1;j<=n;j++)
                  mat[i][j]=sc.nextInt();
          }


          int flag,operationCount=0;
          while(true)
          {
              flag=0;
              for(int i=1;i<=n;i++)
              {
                  for(int j=n;j>=1;j--)
                  {
                      if(mat[i][j]!=((i-1)*n)+j)
                      {
                          flag=1;
                          operationCount++;
                          transposeMatrix(mat,j);
                      }
                      if(flag==1)
                          break;
                  }
                  if(flag==1)
                      break;
              }
              if(flag==0)
                  break;
          }

          System.out.println(operationCount);
      }
      sc.close();
	}
}
