/*
APS-2020
Problem Description : This program prints the sum of each row in the given matrix
Input : inetger[r][c]
Output : r*integer (sum of each row)
Code by : Sagar Kulkarni
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<stdbool.h>

int main()
{
    int r,c;
    int i,j;
    int *p,sum;
    printf("Enter no of rows\n");
    scanf("%d",&r);
    printf("Enter no of coloumns\n");
    scanf("%d",&c);

    int matrix[r][c];
    printf("Enter %d matrix elements\n",(r*c));
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
            scanf("%d",&matrix[i][j]);
    }

    for(i=0;i<r;i++)
    {
        sum=0;
        p=&matrix[i][0];
        for(j=0;j<c;j++)
            sum+=*(p+j);
        printf("Sum of %d row : %d\n",i+1,sum);
    }
    return 0;
}
