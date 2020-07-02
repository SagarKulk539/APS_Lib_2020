/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1327/problem/B
Code by : Sagar Kulkarni
*/

import java.util.Scanner;

public class Princess_Edu_84_B
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        for(int iter1=0;iter1<T;iter1++)
        {
            int N=sc.nextInt();
            boolean[] princeMarried=new boolean[N+1];
            int freePrincess=0;

            for(int i=1;i<N+1;i++)
            {
                princeMarried[i]=false;
            }

            for(int i=1;i<N+1;i++)
            {
                boolean princessDone=false;
                int k=sc.nextInt();
                for(int j=0;j<k;j++)
                {
                    int princessChoice=sc.nextInt();

                    if(princessDone)
                        continue;
                    if(princeMarried[princessChoice])
                        continue;

                    princessDone=true;
                    princeMarried[princessChoice]=true;
                }
                if(!princessDone)
                {
                    freePrincess=i;
                }
            }

            if(freePrincess==0)
            {
                System.out.println("OPTIMAL");
            }
            else
            {
                System.out.println("IMPROVE");
                System.out.print(freePrincess+" ");
                for(int i=1;i<=N;i++)
                {
                    if(!princeMarried[i])
                    {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}
