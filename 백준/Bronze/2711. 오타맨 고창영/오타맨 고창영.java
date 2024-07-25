import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			String[] sp = br.readLine().split(" ");
			int trgIdx = Integer.parseInt(sp[0]) - 1;
			int sLen = sp[1].length();
			
			for (int i = 0; i < sLen; i++) {
				if(i == trgIdx) {
					continue;
				}
				sb.append(sp[1].charAt(i));
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}