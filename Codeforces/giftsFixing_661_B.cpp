/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1399/problem/B
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

    for(long long int k=0;k<t;k++)
    {
        long long int n;
        cin>>n;

        long long int arrA[n];
        long long int arrB[n];

        long long int minA=LLONG_MAX;
        long long int minB=LLONG_MAX;

        for(long long int i=0;i<n;i++)
        {
            cin>>arrA[i];
            if(arrA[i]<minA)
                minA=arrA[i];
        }

        for(long long int i=0;i<n;i++)
        {
            cin>>arrB[i];
            if(arrB[i]<minB)
                minB=arrB[i];
        }

        long long int count=0;
        for(long long int i=0;i<n;i++)
        {
            long long int diffA=arrA[i]-minA;
            long long int diffB=arrB[i]-minB;

            if(diffA>0 && diffB>0)
            {
                long long int temp=min(diffA,diffB);
                diffA-=temp;
                diffB-=temp;

                count+=temp;
                count+=max(diffA,diffB);
            }
            else if(diffA>0 || diffB>0)
            {
                if(diffA>0)
                    count+=diffA;
                else
                    count+=diffB;
            }
        }
        cout<<count<<"\n";
    }
    return 0;
}
