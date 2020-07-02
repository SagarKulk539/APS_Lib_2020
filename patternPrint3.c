/*
APS-2020
Problem Description : Program to print the following Pattern
ABCBA
AB BA
A   A
Input : int (n)
Output : char[] (printing the given pattern)
Code by : Sagar Kulkarni
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<stdbool.h>

int main()
{
    int n;
    int i,j,k;
    printf("Enter N\n");
    scanf("%d",&n);
    int count=0;
    for(i=0;i<n;i++)
    {
        for(j=0;j<(n-i);j++)
            printf("%c",'A'+j);

        for(k=0;k<(2*(i-1));k++)
            printf(" ");

        if(count!=0)
            printf(" ");
        if(i==0)
            j=j-2;
        else
            j--;

        for(;j>=0;j--)
            printf("%c",'A'+j);

        printf("\n");
        count++;
    }
    return 0;
}
