/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/792/problem/A
Code by : Sagar Kulkarni
*/

#include<iostream>
#include <bits/stdc++.h>
#include<climits>
#include<cmath>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long long int n;
    cin>>n;

    long long int arr[n];
    for(long long int i=0;i<n;i++)
        cin>>arr[i];

    long long int x=sizeof(arr)/sizeof(arr[0]);
    sort(arr,arr+x);

    long long int minDiff=LLONG_MAX;
    for(long long int i=1;i<n;i++)
    {
        long long int temp=abs(arr[i]-arr[i-1]);
        if(temp<minDiff)
            minDiff=temp;
    }

    long long int count=0;
    for(long long int i=1;i<n;i++)
    {
        long long int temp=abs(arr[i]-arr[i-1]);
        if(temp==minDiff)
            count++;
    }
    cout<<minDiff<<" "<<count<<"\n";
    return 0;
}
