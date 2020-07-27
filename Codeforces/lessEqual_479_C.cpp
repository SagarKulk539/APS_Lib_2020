/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/977/problem/C
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

    if(k>n)
        cout<<-1<<"\n";
    else if(k==0)
    {
        long long int x=sizeof(arr)/sizeof(arr[0]);
        sort(arr,arr+x);
        
        long long int temp=arr[0]-1;
        if(temp>=1 && temp<=pow(10,9))
            cout<<temp<<"\n";
        else
            cout<<-1<<"\n";
    }
    else
    {
        long long int x=sizeof(arr)/sizeof(arr[0]);
        sort(arr,arr+x);

        long long int index=k-1;
        long long int newIndex=k;

        if(newIndex<=n-1)
        {
            if(arr[index]==arr[newIndex])
                cout<<-1<<"\n";
            else
                cout<<arr[index]<<"\n";
        }
        else
            cout<<arr[index]<<"\n";
    }
    return 0;
}
