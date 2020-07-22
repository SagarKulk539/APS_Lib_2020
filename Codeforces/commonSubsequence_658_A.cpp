/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1382/problem/A
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
        long long int a,b;
        cin>>a>>b;
        long long int arr1[a],arr2[b];

        for(long long int i=0;i<a;i++)
            cin>>arr1[i];

        for(long long int i=0;i<b;i++)
            cin>>arr2[i];

        if(a<b)
        {
            int flag=0;
            for(long long int i=0;i<a;i++)
            {
                for(long long int k=0;k<b;k++)
                {
                    if(arr1[i]==arr2[k])
                    {
                        flag=1;
                        cout<<"YES\n1 ";
                        cout<<arr1[i]<<"\n";
                        break;
                    }
                }
                if(flag==1)
                    break;
            }
            if(flag==0)
                cout<<"NO\n";
        }
        else
        {
            int flag=0;
            for(long long int i=0;i<b;i++)
            {
                for(long long int k=0;k<a;k++)
                {
                    if(arr2[i]==arr1[k])
                    {
                        flag=1;
                        cout<<"YES\n1 ";
                        cout<<arr2[i]<<"\n";
                        break;
                    }
                }
                if(flag==1)
                    break;
            }
            if(flag==0)
                cout<<"NO\n";
        }

    }
    return 0;
}
