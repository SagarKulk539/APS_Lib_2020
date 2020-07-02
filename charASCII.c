/*
APS-2020
Problem Description : Program to print all ASCII values and their equivalent characters
Input : null
Output : int, char (ASCII, character)
Code by : Sagar Kulkarni
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<stdbool.h>

int main()
{
    int N;
    while(N<256)
    {
        printf("%d = %c\n",N,N);
        N++;
    }
    return 0;
}
