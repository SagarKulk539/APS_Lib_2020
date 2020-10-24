/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1433/problem/C
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Piranha_677_C
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    
	    for(int j=0;j<t;j++)
	    {
	        int n=sc.nextInt();
	        long[] arr=new long[n];
	        
	        int flag=0;
	        long prev=0,curr=0,maxValue=Long.MIN_VALUE;
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextLong();
	            if(arr[i]>maxValue)
	                maxValue=arr[i];
	            curr=arr[i];
	            if(i!=0)
	            {
	                if(prev!=curr)
	                    flag=1;
	            }
	            prev=arr[i];
	        }
	        
	        if(flag==0)
	            System.out.println(-1);
	        else
	        {
	            int index=-1;
	            
	            for(int i=0;i<n;i++)
	            {
	                if(arr[i]==maxValue)
	                {
	                    if(i>0)
	                    {
	                        if(arr[i-1]<maxValue)
	                            index=i;
	                    }
	                    if(i<n-1)
	                    {
	                        if(arr[i+1]<maxValue)
	                            index=i;
	                    }
	                }
	            }
	            
	            if(index==-1)
	                System.out.println(-1);
	            else
	                System.out.println(index+1);
	        }
	    }
	    sc.close();
	}
}
