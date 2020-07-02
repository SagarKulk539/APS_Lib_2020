/*
APS-2020
Problem Description/Goal : How many structurally different binary trees are possible with n nodes?
Input : integer 'n' (no of nodes)
Ouptut : integer (denoting no of different structures in a binary tree)
Code by : Sagar Kulkarni
*/
import java.util.*;

class Main
{
    public static int catalan(int n)
    {
        int[] c=new int[n+1];
        c[0]=1;
        c[1]=1;
        c[2]=2;
        for(int i=3;i<=n;i++)
        {
            c[i]=0;
            for(int j=0;j<i;j++)
            {
                c[i]+=c[j] * c[(i-1)-j];
            }
        }
        return c[n];
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println("Structurally Different binary trees possible wtih "+n+" nodes : "+catalan(n));
        sc.close();
    }
}
