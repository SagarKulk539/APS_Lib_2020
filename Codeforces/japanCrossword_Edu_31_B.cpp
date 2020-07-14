/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/884/problem/B
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
#include<climits>
#include<cmath>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long long int n,x;
    cin>>n>>x;

    long long int sum=0;
    long long int temp;
    for(long long int i=0;i<n;i++)
    {
        cin>>temp;
        sum+=temp;
    }

    if(sum+(n-1)==x)
        cout<<"YES\n";
    else
        cout<<"NO\n";

    return 0;
}
