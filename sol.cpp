#include <bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
using namespace std;
using namespace __gnu_pbds;

#define ll long long
#define ar array

typedef tree<int, null_type, less<int>, rb_tree_tag,
tree_order_statistics_node_update> indexed_set;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	int n;
	cin >> n;
	string s[n];
	map<string, bool> mp;
	for(int i=0; i<n; ++i) {
		cin >> s[i];
		mp[s[i]]=0;
	}
	bool vis[n+1];
	memset(vis, 0, sizeof(vis));
	for(int i=0; i<n; ++i) {
		if(!mp[s[i]])
			mp[s[i]]=1;
		else
			vis[i]=1;
	}
	for(int i=0; i<n; ++i) {
		if(vis[i])
			cout << "YES";
		else
			cout << "NO";
		cout << "\n";
	}
}
