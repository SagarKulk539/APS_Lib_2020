/*
APS-2020
Problem Description : This program sorts every row in a given matrix
Input : inetger[r][c]
Output : integer[r][c] (where each row is sorted)
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
    int *p;
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

    for(i=0;i<r;i++)
    {
        p=&matrix[i][0];
        for(j=0;j<c;j++)
        {
            flag=0;
            for(k=0;k<c-j-1;k++)
            {
                if(*(p+k)>*(p+k+1))
                {
                    temp=*(p+k);
                    *(p+k)=*(p+k+1);
                    *(p+k+1)=temp;
                    flag=1;
                }
            }
            if(flag==0)
                break;
        }
    }

    printf("After row-wise sort\n");
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
            printf("%d ",matrix[i][j]);
        printf("\n");
    }
    return 0;
}
