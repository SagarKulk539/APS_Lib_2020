/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1337/problem/B
Code by : Sagar Kulkarni
*/


import java.util.*;

public class Spell_635_B
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int x,n,m;
            x=sc.nextInt();
            n=sc.nextInt();
            m=sc.nextInt();

            int backup=x;
            int temp1;
            int temp2=m*10;
            int prevVal,currVal;
            for(int i=0;i<n;i++)
            {
                prevVal=x;
                currVal=(int)Math.floor(x/2)+10;
                if(currVal<prevVal)
                    x=(int)Math.floor(x/2)+10;
                else
                    break;
            }

            temp1=backup-x;
            if(temp1+temp2>=backup)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
        sc.close();
    }
}
