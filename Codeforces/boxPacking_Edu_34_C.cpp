/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/903/problem/C
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
    map<long long int,long long int> freqMap;
    for(long long int i=0;i<n;i++)
    {
        cin>>arr[i];
        if(freqMap.find(arr[i])==freqMap.end())
            freqMap.insert(pair<long long int,long long int>(arr[i],1));
        else
        {
            long long int temp=freqMap.find(arr[i])->second;
            freqMap.find(arr[i])->second=temp+1;
        }
    }

    long long int maxCount=LLONG_MIN;
    map<long long int,long long int>::iterator itr;
    for(itr=freqMap.begin();itr!=freqMap.end();itr++)
    {
        if(itr->second>maxCount)
            maxCount=itr->second;
    }

    cout<<maxCount<<"\n";
    return 0;
}
