/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1334/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Stat_Edu_85_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            int[] plays=new int[n];
            int[] clears=new int[n];
            boolean isValid=true;

            for(int i=0;i<n;i++)
            {
                plays[i]=sc.nextInt();
                clears[i]=sc.nextInt();
            }

            int enterLoop=1;
            if(clears[0]>plays[0])
            {
                isValid=false;
                enterLoop=0;
            }
            if(enterLoop==1)
            {
                for(int i=0;i<n-1;i++)
                {
                    if(clears[i+1]==clears[i])
                    {
                        if(plays[i+1]<plays[i])
                        {
                            isValid=false;
                            break;
                        }
                    }
                    else if(clears[i+1]<clears[i])
                    {
                        isValid=false;
                        break;
                    }
                    else if(clears[i+1]>clears[i])
                    {
                        if(plays[i+1]<=plays[i])
                        {
                            isValid=false;
                            break;
                        }
                        else
                        {
                            int temp1=clears[i+1]-clears[i];
                            int temp2=plays[i+1]-plays[i];
                            if(temp1>temp2)
                            {
                                isValid=false;
                                break;
                            }

                        }
                    }
                }
            }

            if(isValid)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
