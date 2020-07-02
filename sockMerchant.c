/*
APS-2020
Problem Description : https://www.hackerrank.com/challenges/sock-merchant/problem
Input : integer (array size), integer[] (array)
Output : integer (count of pairs)
Code by : Sagar Kulkarni
*/

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>
#include<stdbool.h>

int sockMerchant(int n,int* arr)
{
    int i,j,count=0;
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(arr[i]==arr[j] && (arr[i]!=-999 && arr[j]!=-999))
            {
                arr[i]=-999;
                arr[j]=-999;
                count++;
            }
        }
    }
    return count;
}

int main()
{
    int n,i;
    printf("Enter array Size\n");
    scanf("%d",&n);

    int arr[n];
    printf("Enter %d array elements\n",n);
    for(i=0;i<n;i++)
        scanf("%d",&arr[i]);
    int res=sockMerchant(n,arr);
    printf("No of pairs : %d\n",res);
    return 0;
}
