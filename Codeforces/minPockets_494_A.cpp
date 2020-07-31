/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1003/problem/A
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin>>n;

    int arr[n];
    int freq[101]={0};

    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
        freq[arr[i]]++;
    }

    int max=0;
    for(int i=1;i<101;i++)
    {
        if(freq[i]>max)
            max=freq[i];
    }

    cout<<max<<"\n";
    return 0;
}
