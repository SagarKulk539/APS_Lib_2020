/*
APS-2020
Problem Description, Input, Output : https://codeforces.com/contest/1337/problem/D
Code by : Sagar Kulkarni
*/

#include<bits/stdc++.h>
#define ll long long
using namespace std;

const int maxx=1e5+100;
ll r[maxx],g[maxx],b[maxx];
int nr,ng,nb;

inline ll judge(ll a[],int na,ll b[],int nb,ll c[],int nc)
{
	ll x,y,z;
	ll ans=3e18;
	for(int i=1;i<=na;i++)
	{
		x=a[i];
		int pos1=lower_bound(b+1,b+nb+1,x)-b;
		int pos2=upper_bound(c+1,c+nc+1,x)-c;
		if(pos2==1||pos1>nb) continue;
		pos2--;
		y=b[pos1];
		z=c[pos2];
		ans=min(ans,((x-y)*(x-y)+(x-z)*(x-z)+(z-y)*(z-y)));
	}
	return ans;
}
int main()
{
	//ofstream file;
    //file.open("output.txt");
	int t;
	scanf("%d",&t);
	while(t--)
	{
		scanf("%d%d%d",&nr,&ng,&nb);
		for(int i=1;i<=nr;i++) cin>>r[i];
		for(int i=1;i<=ng;i++) cin>>g[i];
		for(int i=1;i<=nb;i++) cin>>b[i];
		sort(g+1,g+1+ng);
		sort(b+1,b+1+nb);
		sort(r+1,r+1+nr);
		ll ans=3e18;
		ans=min(ans,judge(r,nr,g,ng,b,nb));
		ans=min(ans,judge(r,nr,b,nb,g,ng));
		ans=min(ans,judge(g,ng,r,nr,b,nb));
		ans=min(ans,judge(g,ng,b,nb,r,nr));
		ans=min(ans,judge(b,nb,r,nr,g,ng));
		ans=min(ans,judge(b,nb,g,ng,r,nr));
		cout<<ans<<endl;
	}
	//file.close();
	return 0;
}
