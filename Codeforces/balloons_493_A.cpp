/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/998/problem/A
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
    long long int minElem=LLONG_MAX;
    long long int index=-1;

    for(long long int i=0;i<n;i++)
    {
        cin>>arr[i];
        if(arr[i]<minElem)
        {
            minElem=arr[i];
            index=i;
        }
    }

    long long int sum=0;
    for(long long int i=0;i<n;i++)
    {
        if(i!=index)
            sum+=arr[i];
    }

    if(minElem==sum || sum==0)
        cout<<"-1\n";
    else
        cout<<1<<"\n"<<index+1<<"\n";
    return 0;
}
