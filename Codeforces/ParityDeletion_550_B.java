/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1144/problem/B
Code by : Sagar Kulkarni
*/

import java.util.*;

public class ParityDeletion_550_B
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int temp;
        ArrayList<Integer> listEven=new ArrayList<Integer>();
        ArrayList<Integer> listOdd=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            temp=sc.nextInt();
            if(temp%2==0)
                listEven.add(temp);
            else
                listOdd.add(temp);
        }

        Collections.sort(listEven,Collections.reverseOrder());
        Collections.sort(listOdd,Collections.reverseOrder());

        int k=Math.min(listEven.size(),listOdd.size());

        if(listEven.size()>listOdd.size())
            listEven.remove(0);
        else if(listOdd.size()>listEven.size())
            listOdd.remove(0);

        for(int i=0;i<k;i++)
        {
            listEven.remove(0);
            listOdd.remove(0);
        }

        long sum=0;

        for(int i=0;i<listEven.size();i++)
            sum+=listEven.get(i);

        for(int i=0;i<listOdd.size();i++)
            sum+=listOdd.get(i);

        System.out.println(sum);
        sc.close();
    }
}
