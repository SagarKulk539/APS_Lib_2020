/*
APS-2020
Problem Description : Program to determine if a given number is power of two or not
Input : integer (n)
Output : bool (power of 2 or not)
Code by : Sagar Kulkarni
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<stdbool.h>

main()
{
    int n;
    bool res;
    printf("Enter Number\n");
    scanf("%d",&n);

    if((n&(n-1))==0)
        res=true;
    else
        res=false;

    if(res)
        printf("Is Power of 2 : true\n");
    else
        printf("Is Power of 2 : false\n");
}
