import java.io.*;

public class Main {
	
	private static int recsCnt = 0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		while(n-- > 0) {
			String rl = br.readLine();
			int res = isPalindrome(rl);
			sb.append(String.format("%d %d\n", res, recsCnt));
			recsCnt = 0;
		}
		
		System.out.println(sb);
	}
	
	private static int isPalindrome(String s) {
		return recursion(s, 0, s.length()-1);
	}
	
	private static int recursion(String s, int l, int r) {
		recsCnt++;
		if(l >= r) {
			return 1;
		}else if(s.charAt(l) != s.charAt(r)) {
			return 0;
		}
		return recursion(s, l+1, r-1);
	}
}