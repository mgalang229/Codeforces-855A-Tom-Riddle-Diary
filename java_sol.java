import java.io.*;
import java.util.*;

public class Main {
	static final Reader in = new Reader();
	static final PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
//		int t=in.nextInt();
		int t=1;
		for(int i=1; i<=t; ++i)
			new Solver();
		out.close();
	}
	
	static class Solver {
		Solver() {
			int n=in.nextInt();
			String[] s = new String[n];
			Map<String, Boolean> mp = new HashMap<String, Boolean>();
			for(int i=0; i<n; ++i) {
				s[i]=in.next();
				mp.put(s[i], false);
			}
			boolean[] vis = new boolean[n+1];
			Arrays.fill(vis, false);
			for(int i=0; i<n; ++i) {
				if(mp.get(s[i])==false)
					mp.put(s[i], true);
				else
					vis[i]=true;
			}
			for(int i=0; i<n; ++i) {
				if(vis[i])
					out.println("YES");
				else
					out.println("NO");
			}
		}
	}
	
	static class Reader {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st=new StringTokenizer(in.readLine());
				} catch(Exception e) {}
			}	
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
	
}
