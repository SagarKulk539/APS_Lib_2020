/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/999/problem/A
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long long int n,k;
    cin>>n>>k;

    long long int arr[n];
    for(long long int i=0;i<n;i++)
        cin>>arr[i];

    long long int i=0,j=n-1;
    while(i<j)
    {
        if(arr[i]<=k)
            i++;
        else if(arr[j]<=k)
            j--;
        else
            break;
    }
    if(i==j)
    {
        long long int count=0;
        if(arr[i]<=k)
            count++;
        if(count==0)
            cout<<n-1<<"\n";
        else
            cout<<n<<"\n";

    }
    else
    {
        if(i>j)
            cout<<n<<"\n";
        else
            cout<<n-(abs(i-j-1))<<"\n";

    }
    return 0;
}
