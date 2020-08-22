/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1401/problem/C
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

    for(ll k=0;k<t;k++)
    {
        ll n;
        cin>>n;

        ll arr[n];
        vector<ll> list;

        int initFlag=0;
        ll prev;
        ll minElem=LLONG_MAX;
        for(ll i=0;i<n;i++)
        {
            cin>>arr[i];
            if(i==0)
                prev=arr[i];
            else
            {
                if(prev>arr[i])
                    initFlag=1;
                prev=arr[i];
            }
            if(minElem>arr[i])
                minElem=arr[i];
        }

        if(initFlag==1)
        {
            for(ll i=0;i<n;i++)
            {
                if(arr[i]%minElem==0)
                {
                    list.push_back(arr[i]);
                    arr[i]=-1;
                }
            }

            sort(list.begin(),list.end());
            reverse(list.begin(),list.end());
            ll temp;
            for(ll i=0;i<n;i++)
            {
                if(arr[i]==-1)
                {
                    temp=list.back();
                    list.pop_back();
                    arr[i]=temp;
                }
            }

            int flag=0;
            for(ll i=0;i<n-1;i++)
            {
                if(arr[i]>arr[i+1])
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
        else
            cout<<"YES\n";
    }
    return 0;
}
