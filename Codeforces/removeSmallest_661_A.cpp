/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1399/problem/A
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
using namespace std;

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

        int flag=0;
        for(long long int i=0;i<n-1;i++)
        {
            if(abs(arr[i]-arr[i+1])>1)
            {
                flag=1;
                break;
            }
        }

        if(flag==0)
            cout<<"YES\n";
        else
            cout<<"NO\n";
    }
    return 0;
}
