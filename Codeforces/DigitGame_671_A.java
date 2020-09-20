/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1419/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class DigitGame_671_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            String str=sc.next();

            char[] array=str.toCharArray();
            int[] arr=new int[n];

            for(int i=0;i<n;i++)
                arr[i]=Character.getNumericValue(array[i]);

            int odd=-1;
            int even=-1;

            for(int i=0;i<n;i+=2)
            {
                if(arr[i]%2!=0)
                    odd=1;
            }

            for(int i=1;i<n;i+=2)
            {
                if(arr[i]%2==0)
                    even=1;
            }

            if(n%2==0)
            {
                if(even==1)
                    System.out.println(2);
                else
                    System.out.println(1);
            }
            else
            {
                if(odd==1)
                    System.out.println(1);
                else
                    System.out.println(2);
            }
        }

        sc.close();
    }
}
