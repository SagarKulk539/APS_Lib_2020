/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/998/problem/B
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long long int n,B;
    cin>>n>>B;

    long long int arr[n];
    for(long long int i=0;i<n;i++)
        cin>>arr[i];

    long long even=0,odd=0;
    vector<long long int> list;

    for(long long int i=0;i<n-2;i++)
    {
        if(arr[i]%2==0)
            even++;
        else
            odd++;

        if(odd==even)
            list.push_back(abs(arr[i]-arr[i+1]));
    }

    sort(list.begin(),list.end());
    long long int count=0;
    for(long long int i=0;i<list.size();i++)
    {
        B-=list[i];
        if(B>=0)
            count++;
        else
            break;
    }
    cout<<count<<"\n";
    return 0;
}
