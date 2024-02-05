import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			int n = Integer.parseInt(br.readLine());

			for (int i = 0; n > 0; i++, n /= 2) {
				int mod = n%2;
				if(mod == 1) {
					sb.append(i).append(" ");
				}
			}
			
			sb.deleteCharAt(sb.length()-1).append("\n"); // 1은 반드시 있음 (n은 1부터 100만 까지)
		}
		
		System.out.println(sb);
	}

}