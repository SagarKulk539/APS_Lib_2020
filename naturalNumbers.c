/*
APS-2020
Problem Description : This program prints the first 'n' natural numbers
Input : int (n)
Output : int[n] ('n' natural numbers)
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
    printf("Enter n\n");
    scanf("%d",&n);
    int i;
    for(i=1;i<=n;i++)
        printf("%d\n",i);
    return 0;
}
