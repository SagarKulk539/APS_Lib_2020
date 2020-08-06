/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1092/problem/B
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
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

    long long int res=0;
    for(long long int i=0;i<n-1;i+=2)
        res+=abs(arr[i]-arr[i+1]);

    cout<<res<<"\n";
    return 0;
}
