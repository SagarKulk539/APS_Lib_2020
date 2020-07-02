/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1355/problem/B
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Young_643_B
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            Arrays.sort(arr);

            int totalGroups=0;
            for(int i=0;i<n;)
            {
                int groupSize=1;
                while(groupSize<arr[i] && (i<(n-1)))
                {
                    groupSize++;
                    i++;
                }
                if(groupSize>=arr[i])
                    totalGroups++;
                i++;
            }
            System.out.println(totalGroups);
        }
        sc.close();
    }
}
