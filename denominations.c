/*
APS-2020
Problem Description : Program to find the number of minimum currency notes of each denominations the cashier will have to give to the withdrawer, if the available denominations are 1,2,5,10,50,100
Input : int (amount)
Output : 6 int (hundred,fifty,ten,five,two,one)
Code by : Sagar Kulkarni
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<stdbool.h>

int main()
{
    int amt,hund,fif,ten,five,two,one;
    printf("Enter amount to be withdrawn : \n");
    scanf("%d",&amt);

    hund=amt/100;
    amt=amt%100;

    fif=amt/50;
    amt=amt%50;

    ten=amt/10;
    amt=amt%10;

    five=amt/5;
    amt=amt%5;

    two=amt/2;
    amt=amt%2;

    one=amt;

    printf("Hundreds=%d\nFifties=%d\nTens=%d\nFive=%d\nTwo=%d\nOne=%d\n",hund,fif,ten,five,two,one);
    return 0;
}
