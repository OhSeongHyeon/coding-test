import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine() + " " + br.readLine();
		int[] abn = Arrays.stream(s.split("\\s"))
			.mapToInt(Integer::parseInt)
			.toArray();
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			int carry = abn[i] - abn[i+n];
			cnt += carry > 0 ? carry : 0;
		}
		
		System.out.println(cnt);
	}
	
}