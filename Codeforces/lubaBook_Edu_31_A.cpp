/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/884/problem/A
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

    long long int n,t;
    cin>>n>>t;

    long long int arr[n];
    for(long long int i=0;i<n;i++)
        cin>>arr[i];

    long long int totalRead=0;
    long long int index=-1;
    for(long long int i=0;i<n;i++)
    {
        totalRead+=86400-arr[i];
        if(totalRead>=t)
        {
            index=i;
            break;
        }
    }
    cout<<index+1<<"\n";
    return 0;
}
