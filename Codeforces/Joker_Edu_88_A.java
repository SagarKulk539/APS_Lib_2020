/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1359/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Joker_Edu_88_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();

            if(m==0)
                System.out.println(0);
            else
            {
                int cardsPerPlayer=n/k;
                if(m<=cardsPerPlayer)
                    System.out.println(m);
                else
                {
                    int nextMax;
                    m-=cardsPerPlayer;
                    nextMax=m/(k-1);
                    if(m%(k-1)!=0)
                        nextMax+=1;
                    System.out.println(cardsPerPlayer-nextMax);
                }
            }
        }
        sc.close();
    }
}
