/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1365/problem/A
Code by : Sagar Kulkarni
*/

import java.util.*;

public class Game_648_A
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int iter1=0;iter1<T;iter1++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();

            int[][] mat=new int[n][m];
            int[] row=new int[n];
            int[] col=new int[m];

            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    mat[i][j]=sc.nextInt();
                    if(mat[i][j]==1)
                    {
                        row[i]=1;
                        col[j]=1;
                    }
                }
            }

            boolean ashishTurn=true;
            boolean vivekTurn=false;

            boolean ashishWins=false;
            boolean vivekWins=false;

            while(true)
            {
                if(ashishTurn)
                {
                    int r=-1,c=-1;
                    for(int i=0;i<n;i++)
                    {
                        if(row[i]==0)
                        {
                            row[i]=1;
                            r=i;
                            break;
                        }
                    }

                    for(int i=0;i<m;i++)
                    {
                        if(col[i]==0)
                        {
                            col[i]=1;
                            c=i;
                            break;
                        }
                    }

                    if(r==-1 || c==-1)
                    {
                        vivekWins=true;
                        break;
                    }
                    vivekTurn=true;
                    ashishTurn=false;
                }
                if(vivekTurn)
                {
                    int r=-1,c=-1;
                    for(int i=0;i<n;i++)
                    {
                        if(row[i]==0)
                        {
                            row[i]=1;
                            r=i;
                            break;
                        }
                    }

                    for(int i=0;i<m;i++)
                    {
                        if(col[i]==0)
                        {
                            col[i]=1;
                            c=i;
                            break;
                        }
                    }

                    if(r==-1 || c==-1)
                    {
                        ashishWins=true;
                        break;
                    }
                    vivekTurn=false;
                    ashishTurn=true;
                }
            }
            if(ashishWins)
                System.out.println("Ashish");
            else
                System.out.println("Vivek");
        }
        sc.close();
    }
}
