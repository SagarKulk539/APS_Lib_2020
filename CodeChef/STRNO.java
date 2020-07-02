/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/APRIL20B/problems/STRNO
Code by : Sagar Kulkarni
*/

import java.lang.*;
import java.io.*;
import java.util.*;

class STRNO
{
    public static boolean possibleFactors(int x,int k)
    {
        ArrayList<Integer> factorArray=new ArrayList<Integer>();
        boolean res;
        while(true)
        {
            if(x%2!=0)
                break;
            factorArray.add(2);
            x/=2;
        }

        for(int j=3;j*j<=x;j+=2)
        {
            while(true)
            {
                if(x%j!=0)
                    break;
                x=x/j;
                factorArray.add(j);
            }
        }

        if(x>2)
            factorArray.add(x);

        if(factorArray.size()<k)
            res=false;
        else
            res=true;

        return res;
    }

    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int X,K;
            X=sc.nextInt();
            K=sc.nextInt();
            boolean isPossible=possibleFactors(X,K);
            if(isPossible)
                System.out.println("1");
            else
                System.out.println("0");
        }
        sc.close();
    }
}
