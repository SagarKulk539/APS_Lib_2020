/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1130/problem/A
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
#define ll long long int
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    ll n;
    cin>>n;

    double arr1[n];
    double arr2[n];
    ll arr[n];
    for(ll i=0;i<n;i++)
    {
        cin>>arr[i];
        arr1[i]=(double)arr[i]/1.0;
        arr2[i]=(double)arr[i]/-1.0;
    }

    ll pos1=0;
    for(ll i=0;i<n;i++)
    {
        if(arr1[i]>0)
            pos1++;
    }

    ll pos2=0;
    for(ll i=0;i<n;i++)
    {
        if(arr2[i]>0)
            pos2++;
    }

    if(n%2==0)
    {
        if(pos1>=(n/2))
            cout<<"1\n";
        else if(pos2>=(n/2))
            cout<<"-1\n";
        else
            cout<<"0\n";
    }
    else
    {
        if(pos1>=(n/2)+1)
            cout<<"1\n";
        else if(pos2>=(n/2)+1)
            cout<<"-1\n";
        else
            cout<<"0\n";
    }


    return 0;
}

