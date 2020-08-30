/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1397/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class JugglingLetters_666_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        long t=sc.nextLong();

        for(long iter=0;iter<t;iter++)
        {
            long n=sc.nextLong();

            HashMap<Character,Long> map=new HashMap<Character,Long>();

            for(long i=0;i<n;i++)
            {
                String s1=sc.next();
                char temp;
                for(int k=0;k<s1.length();k++)
                {
                    temp=s1.charAt(k);
                    if(map.containsKey(temp))
                    {
                        long val=map.get(temp);
                        val++;
                        map.put(temp,val);
                    }
                    else
                        map.put(temp,(long)1);
                }
            }

            long tempVal;
            int flag=0;
            for(Character ch:map.keySet())
            {
                tempVal=map.get(ch);
                if(tempVal%n!=0)
                {
                    flag=1;
                    break;
                }
            }

            if(flag==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
