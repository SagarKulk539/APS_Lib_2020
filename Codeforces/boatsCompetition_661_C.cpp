/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1399/problem/C
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
using namespace std;

long long int countPairs(long long int arr[],long long int n,long long int sum)
{
    long long int count=0;
    for(long long int i=0,j=n-1;i<j;)
    {
        long long int temp=arr[i]+arr[j];
        if(temp==sum)
        {
            count++;
            i++;
            j--;
        }
        else if(temp<sum)
            i++;
        else
            j--;
    }
    return count;
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long long int t;
    cin>>t;

    for(long long int k=0;k<t;k++)
    {
        long long int n;
        cin>>n;

        long long int arr[n];
        for(long long int i=0;i<n;i++)
            cin>>arr[i];

        long long int x=sizeof(arr)/sizeof(arr[0]);
        sort(arr,arr+x);

        long long int maxCount=LLONG_MIN;
        for(long long int i=2;i<=100;i++)
        {
            long long int temp=countPairs(arr,n,i);
            if(temp>maxCount)
                maxCount=temp;
        }

        cout<<maxCount<<"\n";
    }
    return 0;
}
