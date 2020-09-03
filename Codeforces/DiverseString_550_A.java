/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1144/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class DiverseString_550_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int k=0;k<n;k++)
        {
            ArrayList<Character> list=new ArrayList<Character>();
            String s1=sc.next();
            for(int i=0;i<s1.length();i++)
                list.add(s1.charAt(i));

            Collections.sort(list);
            int flag=0;
            for(int i=0;i<list.size()-1;i++)
            {
                if(Math.abs((int)(list.get(i))-(int)(list.get(i+1)))!=1)
                {
                    flag=1;
                    break;
                }
            }

            if(flag==0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        sc.close();
    }
}
