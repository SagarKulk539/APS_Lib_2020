/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/873/problem/A
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

    long long int n,k,x;
    cin>>n>>k>>x;

    long long int arr[n];
    for(long long int i=0;i<n;i++)
        cin>>arr[i];

    long long int totalSum=0;
    long long count=0;
    for(long long int j=0;j<k;j++)
    {
        if(arr[n-1-j]>x)
        {
            totalSum+=x;
            count++;
        }
        else
            break;
    }

    for(long long int i=0;i<n-count;i++)
            totalSum+=arr[i];
            
    cout<<totalSum<<"\n";
    return 0;
}
