/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1077/problem/B
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

    long long int count=0;
    for(long long int i=1;i<n-1;i++)
    {
        if(arr[i]==0)
        {
            if(arr[i-1]==1 && arr[i+1]==1)
            {
                arr[i]=arr[i+1]=arr[i-1]=-1;
                count++;
            }
        }
    }
    cout<<count<<"\n";
    return 0;
}
