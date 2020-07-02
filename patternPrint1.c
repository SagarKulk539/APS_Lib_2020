/*
APS-2020
Problem Description : Program to print a Pattern
*
* *
* * *
* * * *
* * * * *
.
.
.
.
upto 'n' terms
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
    int N,i,j;
    printf("Enter N\n");
    scanf("%d",&N);

    for(i=1;i<=N;i++)
    {
        for(j=1;j<=i;j++)
        {
            printf("* ");
        }
        printf("\n");
    }
    return 0;
}
