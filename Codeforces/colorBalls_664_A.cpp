/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1395/problem/A
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
using namespace std;

long long int minFun(long long int a,long long int b,long long int c)
{
    if(a<b && a<c)
        return a;
    else if(b<c && b<a)
        return b;
    else
        return c;
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    long long int t;
    cin>>t;

    for(long long int k=0;k<t;k++)
    {
        long long int r,g,b,w;
        cin>>r>>g>>b>>w;

        long long int arr1[4]={r,g,b,w};
        long long int oddC1=0;
        for(long long int i=0;i<4;i++)
        {
            if(arr1[i]%2!=0)
                oddC1++;
        }
        if(oddC1<=1)
            cout<<"Yes\n";
        else
        {
            if(r==0 || g==0 || b==0)
            {
                if(r==0 && g==0 && b==0)
                    cout<<"Yes\n";
                else
                    cout<<"No\n";
            }
            else
            {
                if(r==g && g==b)
                    cout<<"Yes\n";
                else
                {
                    long long int arrCopy[4]={r,g,b,w};
                    long long int oddC2=0;
                    long long int minVal=minFun(r,g,b);
                    r-=minVal;
                    g-=minVal;
                    b-=minVal;
                    w+=minVal*3;
                    long long int arr2[4]={r,g,b,w};
                    for(long long int i=0;i<4;i++)
                    {
                        if(arr2[i]%2!=0)
                            oddC2++;
                    }
                    if(oddC2<=1)
                        cout<<"Yes\n";
                    else
                    {
                        r=arrCopy[0];
                        g=arrCopy[1];
                        b=arrCopy[2];
                        w=arrCopy[3];

                        long long int oddC3=0;
                        long long int minVal=minFun(r,g,b)-1;
                        minVal=max((long long int)0,minVal);
                        r-=minVal;
                        g-=minVal;
                        b-=minVal;
                        w+=minVal*3;
                        long long int arr3[4]={r,g,b,w};
                        for(long long int i=0;i<4;i++)
                        {
                            if(arr3[i]%2!=0)
                                oddC3++;
                        }
                        if(oddC3<=1)
                            cout<<"Yes\n";
                        else
                            cout<<"No\n";
                    }
                }
            }
        }
    }
    return 0;
}
