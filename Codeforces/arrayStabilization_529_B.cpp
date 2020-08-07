/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1095/problem/B
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
    long long int min1=LLONG_MAX,max1=LLONG_MIN;
    long long int min2=LLONG_MAX,max2=LLONG_MIN;
    for(long long int i=0;i<n;i++)
    {
        cin>>arr[i];
        if(arr[i]>max1)
        {
            max2=max1;
            max1=arr[i];
        }
        else if(arr[i]>max2)
            max2=arr[i];

        if(arr[i]<min1)
        {
            min2=min1;
            min1=arr[i];
        }
        else if(arr[i]<min2)
            min2=arr[i];
    }

    long long int res=min(max2-min1,max1-min2);
    cout<<res<<"\n";
    return 0;
}
