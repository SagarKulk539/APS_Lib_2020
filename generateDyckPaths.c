/*
APS-2020
Problem Description : Genrates all valid strings of dyck paths
Input : integer (denoting the no of X's and Y's in the string)
Output : string[] (generates all valid dyck paths) 
Code by : Sagar Kulkarni
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int count=0;

int isValidDyckPath(char* str)
{
    int i;
    int count=0;
    for(i=0;i<strlen(str);i++)
    {
        if(str[i]=='X')
            count++;
        else
        {
            count--;
            if(count<0)
                return 0;
        }
    }
    return 1;
}

int shouldSwap(char* str,int start,int curr)
{
    int i;
    for(i=start;i<curr;i++)
        if(str[i]==str[curr])
            return 0;
    return 1;
}

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
    {
        int ch=isValidDyckPath(a);
        if(ch)
        {
            count++;
            printf("%s\n",a);
        }

    }

    else
    {
        for(i=l;i<=r;i++)
        {
            int check=shouldSwap(a,l,i);
            if(check)
            {
                swap((a+l),(a+i));
                computePermutation(a,l+1,r);
                swap((a+l),(a+i));
            }
        }
    }
}

int main()
{
    char str[100];
    int N;
    strcpy(str,"");
    scanf("%d",&N);

    int i,j;
    for(i=0;i<N;i++)
        strcat(str,"X");
    for(j=0;j<N;j++)
         strcat(str,"Y");

    int n=strlen(str);
    computePermutation(str,0,n-1);
    printf("Total Dyck Paths : %d",count);
    return 0;
}
