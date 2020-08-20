/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1392/problem/C
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

        ll prev,curr;
        ll ans=0;
        for(ll i=0;i<n;i++)
        {
            cin>>curr;
            if(i==0)
                prev=curr;
            else
            {
                if(prev>curr)
                    ans+=prev-curr;
                prev=curr;
            }
        }
        cout<<ans<<"\n";
    }
    return 0;
}
