/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/845/problem/A
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long int n;
    cin>>n;

    long int arr[2*n];
    for(long int i=0;i<(2*n);i++)
        cin>>arr[i];

    long int x=sizeof(arr)/sizeof(arr[0]);
    sort(arr,arr+x);

    long int term=arr[n];

    int flag=0;
    for(long int i=0;i<n;i++)
    {
        if(arr[i]>=term)
        {
            flag=1;
            break;
        }
    }

    if(flag==0)
        cout<<"YES\n";
    else
        cout<<"NO\n";
    return 0;
}
