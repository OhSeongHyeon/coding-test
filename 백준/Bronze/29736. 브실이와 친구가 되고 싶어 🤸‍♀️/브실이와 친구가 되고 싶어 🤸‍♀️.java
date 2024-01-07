import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st1.nextToken());
		int x = Integer.parseInt(st1.nextToken());
		int minLen = k-x < 0 ? 1 : k-x;
		int maxLen = k + x;
		if(maxLen < a) {
			System.out.println("IMPOSSIBLE");
			return;
		}
		System.out.println(Math.min(b, maxLen) - Math.max(a, minLen) + 1);
	}

}