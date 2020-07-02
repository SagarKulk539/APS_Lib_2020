/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1352/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Round_640_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            ArrayList<Integer> list=new ArrayList<Integer>();
            int count=0;
            while(n!=0)
            {
                int temp=(int)Math.pow(10,count);
                if((n%10)!=0)
                    list.add((n%10)*temp);
                n/=10;
                count++;
            }
            System.out.println(list.size());
            for(int i=0;i<list.size();i++)
                System.out.print(list.get(i)+" ");
            System.out.println();
        }
        sc.close();
    }
}
