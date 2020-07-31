/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1388/problem/A
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

    for(long long int var=0;var<t;var++)
    {
        long long int n;
        cin>>n;

        long long int arr[]={6,10,14,15,21,26,33,35,39,51,55};
        int flag=0;
        for(long long int i=0;i<11;i++)
        {
            for(long long int j=i+1;j<11;j++)
            {
                for(long long int k=j+1;k<11;k++)
                {
                    long long int res=n-(arr[i]+arr[j]+arr[k]);
                    if(res>0 && res!=arr[i] && res!=arr[j] && res!=arr[k])
                    {
                        flag=1;
                        cout<<"YES\n";
                        cout<<arr[i]<<" "<<arr[j]<<" "<<arr[k]<<" "<<res<<"\n";
                        break;
                    }
                }
                if(flag==1)
                    break;
            }
            if(flag==1)
                break;
        }

        if(flag==0)
            cout<<"NO\n";
    }
    return 0;
}



