/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1433/problem/B
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Bookshelf_677_B
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=0;k<t;k++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            int total=0;
            int count,flag;

            for(int i=0;i<n;i++)
            {
                if(arr[i]==1)
                {
                    count=0;
                    flag=0;
                    for(int j=i+1;j<n;j++)
                    {
                        if(arr[j]==1)
                        {
                            flag=1;
                            break;
                        }
                        else
                            count++;
                    }

                    if(flag==1)
                        total+=count;
                }
            }

            System.out.println(total);

        }
        sc.close();
    }
}
