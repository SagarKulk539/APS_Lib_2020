/*
APS-2020
Problem Description/Goal : To find the last person alive in a circular arrangment of 'n' people
Input : 2 integers (n-denoting no of people,k-kill order/sequence)
Output : integer (denoting the last person alive)
Code by : Sagar Kulkarni
*/

import java.util.*;

class Main
{
    public static int josephus(int  n,int k)
    {
        int res=0;

        for(int i=1;i<=n;++i)
            res=(res+k)%i;

        return res+1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,k;
        System.out.println("Enter n");
        n=sc.nextInt();
        System.out.println("Enter k");
        k=sc.nextInt();

        System.out.println("Alive at end : "+josephus(n,k));
        sc.close();
    }
}
