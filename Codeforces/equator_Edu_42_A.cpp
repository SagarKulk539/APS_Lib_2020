/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/962/problem/A
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
    long long int sum=0;
    for(long long int i=0;i<n;i++)
    {
        cin>>arr[i];
        sum+=arr[i];
    }
    
    if((sum&1)==0)
        sum/=2;
    else
        sum=(sum/2)+1;

    long long int temp=0;
    for(long long int i=0;i<n;i++)
    {
        temp+=arr[i];
        if(temp>=sum)
        {
            cout<<i+1<<"\n";
            break;
        }
    }
    return 0;
}
