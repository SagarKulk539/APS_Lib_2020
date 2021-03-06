/*
APS-2020
Problem Description : This program sorts every coloumn in a given matrix
Input : inetger[r][c]
Output : integer[r][c] (where each coloumn is sorted)
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
    int i,j,k;
    int flag,temp;
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

    for(i=0;i<c;i++)
    {
        for(j=0;j<r;j++)
        {
            flag=0;
            for(k=0;k<r-j-1;k++)
            {
                if(matrix[k][i]>matrix[k+1][i])
                {
                    temp=matrix[k][i];
                    matrix[k][i]=matrix[k+1][i];
                    matrix[k+1][i]=temp;
                    flag=1;
                }
            }
            if(flag==0)
                break;
        }
    }

    printf("After coloumn-wise sort\n");
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
            printf("%d ",matrix[i][j]);
        printf("\n");
    }
    return 0;
}
