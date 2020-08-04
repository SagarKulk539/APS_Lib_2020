/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1015/problem/A
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long long int n,m;
    cin>>n>>m;

    long long int arr[m+1]={0};

    long long int count=0;
    for(long long int k=0;k<n;k++)
    {
        long long int l,r;
        cin>>l>>r;

        for(long long int i=l;i<=r;i++)
        {
            if(arr[i]!=-1)
            {
                arr[i]=-1;
                count++;
            }
        }
    }

    cout<<m-count<<"\n";
    for(long long int i=1;i<=m;i++)
    {
        if(arr[i]==0)
            cout<<i<<" ";
    }
    cout<<"\n";

    return 0;
}
