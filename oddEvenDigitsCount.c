/*
APS-2020
Problem Description : Program to count the number of even and odd digits in a given number
Input : int (m)
Output : 2 int (oddCount,evenCount)
Code by : Sagar Kulkarni
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<stdbool.h>

int main()
{
    int even=0,odd=0;
    int n,r;
    printf("Enter a Number\n");
    scanf("%d",&n);

    for(;n!=0;)
    {
        r=n%10;
        n=n/10;
        if(r%2==0)
            even++;
        else
            odd++;
    }
    printf("Even Digits = %d\nOdd Digits = %d\n",even,odd);
    return 0;
}
