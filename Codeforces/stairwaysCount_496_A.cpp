/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1005/problem/A
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
    for(long long int i=0;i<n;i++)
        cin>>arr[i];

    vector<long long int> list;
    long long int size=1;
    for(long long int i=1;i<n;i++)
    {
        if(arr[i]==1)
        {
            list.push_back(size);
            size=1;
        }
        else
            size++;
    }
    list.push_back(size);
    cout<<list.size()<<"\n";
    for(long long int i=0;i<list.size();i++)
        cout<<list[i]<<" ";
    cout<<"\n";
    return 0;
}
