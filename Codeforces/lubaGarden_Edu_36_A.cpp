/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/915/problem/A
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long long int n,k;
    cin>>n>>k;

    long long int arr[n];
    for(long long int i=0;i<n;i++)
        cin>>arr[i];

    long long int x=sizeof(arr)/sizeof(arr[0]);
    sort(arr,arr+x);

    long long int val=-1;
    for(long long int i=n-1;i>=0;i--)
    {
        if(k%arr[i]==0)
        {
            val=arr[i];
            break;
        }
    }
    cout<<k/val<<"\n";

    return 0;
}
