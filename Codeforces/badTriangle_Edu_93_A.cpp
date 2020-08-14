/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1398/problem/A
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long long int t;
    cin>>t;
    for(long long int k=0;k<t;k++)
    {
        long long int n;
        cin>>n;

        long long int arr[n];
        for(long long int i=0;i<n;i++)
            cin>>arr[i];

        long long int temp=arr[0]+arr[1];
        if(temp<=arr[n-1])
            cout<<"1 2 "<<n<<"\n";
        else
            cout<<"-1\n";
    }
    return 0;
}

