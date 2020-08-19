/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1392/problem/B
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
#define ll long long int
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    ll t;
    cin>>t;

    for(ll j=0;j<t;j++)
    {
        ll n,k;
        cin>>n>>k;

        ll arr[n];
        ll arr1[n];
        ll arr2[n];

        ll maxElem1=LLONG_MIN;
        for(ll i=0;i<n;i++)
        {
            cin>>arr[i];
            if(arr[i]>maxElem1)
                maxElem1=arr[i];
        }

        ll maxElem2=LLONG_MIN;
        for(ll i=0;i<n;i++)
        {
            arr1[i]=maxElem1-arr[i];
            if(arr1[i]>maxElem2)
                maxElem2=arr1[i];
        }
        
        for(ll i=0;i<n;i++)
            arr2[i]=maxElem2-arr1[i];

        if(k%2==0)
        {
            for(ll i=0;i<n;i++)
                cout<<arr2[i]<<" ";
            cout<<"\n";
        }
        else
        {
            for(ll i=0;i<n;i++)
                cout<<arr1[i]<<" ";
            cout<<"\n";
        }
    }
    return 0;
}
