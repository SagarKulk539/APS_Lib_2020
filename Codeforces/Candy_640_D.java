/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1352/problem/D
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Candy_640_D
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            ArrayList<Integer> list=new ArrayList<Integer>();
            for(int i=0;i<n;i++)
                list.add(sc.nextInt());

            int aliceEats=list.get(0);
            int bobEats=0;
            int aliceCurrSum=list.get(0);
            int bobCurrSum=0;

            list.remove(0);//alice ate first!

            int count=1;
            int flag=0;
            while(list.size()!=0)
            {
                //bobEats
                while(bobCurrSum<=aliceCurrSum)
                {
                    if(list.size()!=0)
                    {
                        bobCurrSum+=list.get(list.size()-1);
                        bobEats+=list.get(list.size()-1);
                        list.remove(list.size()-1);
                    }
                    else
                    {
                        flag=1;
                        break;
                    }
                }
                count++;
                // System.out.print(bobCurrSum+" ");
                if(flag==1 || list.size()==0)
                    break;

                //aliceEats
                aliceCurrSum=0;
                while(aliceCurrSum<=bobCurrSum)
                {
                    if(list.size()!=0)
                    {
                        aliceCurrSum+=list.get(0);
                        aliceEats+=list.get(0);
                        list.remove(0);
                    }
                    else
                    {
                        flag=1;
                        break;
                    }

                }
                count++;
                // System.out.println(aliceCurrSum);
                if(flag==1 || list.size()==0)
                    break;
                bobCurrSum=0;
            }
            System.out.println(count+" "+aliceEats+" "+bobEats);
        }
        sc.close();
    }
}
