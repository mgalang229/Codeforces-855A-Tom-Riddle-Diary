import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] s = new String[n];
		Map<String, Boolean> mp = new HashMap<String, Boolean>();
		for (int i = 0; i < n; i++) {
			s[i] = in.next();
			mp.put(s[i], false);
		}
		boolean[] repeated = new boolean[n + 1];
		Arrays.fill(repeated, false);
		for (int i = 0; i < n; i++) {
			if (mp.get(s[i]) == false) {
				mp.put(s[i], true);
			} else {
				repeated[i] = true;
			}
		}
		for (int i = 0; i < n; i++) {
			if (repeated[i]) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
