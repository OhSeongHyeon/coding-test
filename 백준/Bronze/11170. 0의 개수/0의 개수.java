import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			String[] sp = br.readLine().split(" ");
			int n = Integer.parseInt(sp[0]);
			int m = Integer.parseInt(sp[1]);
			int cnt = n == 0 ? 1 : 0;
			
			for (int i = n; i <= m; i++) {
				int num = i;
				while(num > 0) {
					if(num%10 == 0) {
						cnt++;
					}
					num /= 10;
				}
			}
			
			sb.append(cnt).append("\n");
		}
		
		System.out.print(sb);
	}
	
}