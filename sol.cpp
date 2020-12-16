#include <bits/stdc++.h>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);
	int n;
	cin >> n;
	string s[n];
	map<string, bool> mp;
	for (int i = 0; i < n; i++) {
		cin >> s[i];
		mp[s[i]] = false;
	}
	bool repeated[n + 1] = {false};
	for (int i = 0; i < n; i++) {
		if (!mp[s[i]]) {
			mp[s[i]] = true;
		} else {
			repeated[i] = true;
		}
	}
	for (int i = 0; i < n; i++) {
		if (repeated[i]) {
			cout << "YES";
		} else {
			cout << "NO";
		}
		cout << '\n';
	}
	return 0;
}
