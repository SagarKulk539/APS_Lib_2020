/*
APS-2020
Problem Description, Input, Output : https://www.codechef.com/problems/CHECHOC
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
        long long int n,m,x,y;
        cin>>n>>m>>x>>y;
            
        long long int val=n*m;
        if(val==1)
        {
            cout<<x<<"\n";
            continue;
        }
        if(x>=y)
        {
            if(val%2!=0)
                cout<<((val/2)+1)*y<<"\n";
            else
                cout<<(val/2)*y<<"\n";
        }
        else
        {
            if(2*x<=y)
                cout<<val*x<<"\n";
            else
            {
                if(val%2!=0)
                    cout<<(val/2)*y+x<<"\n";
                else
                    cout<<(val/2)*y<<"\n";
            }
        }
    }
    return 0;
}
