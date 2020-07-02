/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1363/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class OddSelection_646_A
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int T=sc.nextInt();
	    for(int iter1=0;iter1<T;iter1++)
	    {
	        int n=sc.nextInt();
	        int x=sc.nextInt();
	        int[] arr=new int[n];
	        
	        if(x>n)
	        {
	            System.out.println("No");
	            continue;
	        }
	        int oddCount=0,evenCount=0;
	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	            if((arr[i]&1)==1)
	                oddCount++;
	            else
	                evenCount++;
	        }
	        if(x==1 && oddCount<1)
	        {
	            System.out.println("No");
	            continue;
	        }

            if(evenCount==0 || oddCount==0)
            {
                if(evenCount==0)
                {
                    if((oddCount&1)==0)
                    {
                        oddCount--;
                        if(oddCount>=x && (x&1)==1)
                            System.out.println("Yes");
                        else
                            System.out.println("No");
                    }
                    else
                    {
                        if(oddCount>=x && (x&1)==1)
                            System.out.println("Yes");
                        else
                            System.out.println("No");
                    }
                }
                else
                    System.out.println("No");
            }
            else
            {
                if((oddCount&1)==1)
                {
                    x-=oddCount;
                    if(evenCount>=x)
                        System.out.println("Yes");
                    else
                        System.out.println("No");
                }
                else
                {
                    oddCount--;
                    x-=oddCount;
                    if(evenCount>=x)
                        System.out.println("Yes");
                    else
                        System.out.println("No");
                }
            }
	        
	    }
	    sc.close();
	}
}
