/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/899/problem/A
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
    long long int count1=0,count2=0;
    for(long long int i=0;i<n;i++)
    {
        cin>>arr[i];
        if(arr[i]==1)
            count1++;
        else
            count2++;
    }

    if(count1>0)
    {
        if(count1>count2)
        {
            long long int ans=count2;
            count1-=count2;
            ans+=count1/3;
            cout<<ans<<"\n";
        }
        else
            cout<<count1<<"\n";

    }
    else
        cout<<0<<"\n";
    return 0;
}
