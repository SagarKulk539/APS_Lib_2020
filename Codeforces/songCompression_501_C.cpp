/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1015/problem/C
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long long int n,m;
    cin>>n>>m;

    long long int t1,t2;
    long long int arr[n];
    long long int sumA=0,sumB=0;
    for(long long int i=0;i<n;i++)
    {
        cin>>t1>>t2;
        sumA+=t1;
        sumB+=t2;
        arr[i]=t1-t2;
    }

    if(sumA<=m)
        cout<<"0\n";
    else if(sumB>m)
        cout<<"-1\n";
    else
    {
        long long int x=sizeof(arr)/sizeof(arr[0]);
        sort(arr,arr+x);

        int count=0;
        for(long long int i=n-1;i>=0;i--)
        {
            sumA-=arr[i];
            count++;
            if(sumA<=m)
                break;
        }
        cout<<count<<"\n";
    }




    return 0;
}
