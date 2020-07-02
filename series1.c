/*
APS-2020
Problem Description : Program to find sum of following series
(1/1!)+(2/2!)+(3/3!)+(4/4!)+(5/5!)+.............
Input : int (no of terms)
Output : float (sum of series)
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
    float sum=0;
    int i=1;
    long int f=1;
    printf("Enter the number of terms\n");
    scanf("%d",&n);

    for(i=1;i<=n;i++)
    {
        sum=sum+(float)i/f;
        f=f*(i+1);
    }
    printf("Sum of Series = %f\n",sum);

    return 0;
}
