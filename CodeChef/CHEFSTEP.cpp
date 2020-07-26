/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/LTIME86B/problems/CHEFSTEP
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
    
    for(long long int j=0;j<t;j++)
    {
        long long int n,k;
        cin>>n>>k;
        
        long long int arr[n];
        for(long long int i=0;i<n;i++)
        {
            cin>>arr[i];
            if(arr[i]%k==0)
                cout<<1<<"";
            else
                cout<<0<<"";
        }
        cout<<"\n";
    }
    return 0;
}
