/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/864/problem/A
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

    long long int n;
    cin>>n;

    long long int arr[n];
    for(long long int i=0;i<n;i++)
        cin>>arr[i];

    long long int x=sizeof(arr)/sizeof(arr[0]);
    sort(arr,arr+x);

    long long int elem1=arr[0];
    long long count1=1;

    if(elem1!=arr[n-1])
    {
        long long int elem2=arr[n-1];
        long long count2=1;

        for(long long int i=1;i<n-1;i++)
        {
            if(arr[i]==elem1)
                count1++;
            if(arr[i]==elem2)
                count2++;
        }

        if(count1==n/2 && count2==n/2)
        {
            cout<<"YES"<<"\n";
            cout<<elem1<<" "<<elem2<<"\n";
        }
        else
            cout<<"NO\n";
    }
    else
        cout<<"NO\n";
    return 0;
}
