/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/758/problem/A
Code by : Sagar Kulkarni
*/

#include <bits/stdc++.h>
#include<climits>
#include<iostream>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin>>n;

    long int arr[n];
    long int maxVal=LONG_MIN;

    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
        if(arr[i]>maxVal)
            maxVal=arr[i];
    }

    long long int totalBurles=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]!=maxVal)
            totalBurles+=maxVal-arr[i];
    }

    cout<<totalBurles<<"\n";
    return 0;
}
