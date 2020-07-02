/*
APS-2020
Problem Description : This program generates all possible Permutations of any string using recursion
Input : string
Output : string[] (Permutations)
Code by : Sagar Kulkarni
*/

#include<stdio.h>
#include<string.h>

void swap(char* x,char* y)
{
    char temp;
    temp=*x;
    *x=*y;
    *y=temp;
}

void computePermutation(char* a,int l,int r)
{
    int i;
    if(l==r)
        printf("%s\n",a);
    else
    {
        for(i=l;i<=r;i++)
        {
            swap((a+l),(a+i));
            computePermutation(a,l+1,r);
            swap((a+l),(a+i));
        }
    }
}

int main()
{
    char str[100];
    printf("Enter String (of max length 100)\n");
    fflush(stdin);
    scanf("%s",str);
    int n=strlen(str);
    computePermutation(str,0,n-1);
    return 0;
}
