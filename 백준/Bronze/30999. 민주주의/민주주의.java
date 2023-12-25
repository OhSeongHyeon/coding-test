import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int cnt = 0;
		
		while(n-- > 0) {
			String input = br.readLine();
			/* m 변수를 쓸일이 없다...
			int o = input.replaceAll("[^O]", "").length();
			int x = input.replaceAll("[^X]", "").length();
			cnt += o > x ? 1 : 0;
			*/
			int on = 0;
			for (int i = 0; i < m; i++) {
				char c = input.charAt(i);
				on += c == 'O' ? 1 : 0;
			}
			cnt += on > m/2 ? 1 : 0;
		}
		
		System.out.println(cnt);
	}

}