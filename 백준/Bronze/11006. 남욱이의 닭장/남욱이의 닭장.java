import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			String[] sp = br.readLine().split("\\s");
			int n = Integer.parseInt(sp[0]);
			int m = Integer.parseInt(sp[1]);
			int cutLegCnt = m*2 - n;
			int normalCnt = m - cutLegCnt;
			sb.append(cutLegCnt).append(" ");
			sb.append(normalCnt).append("\n");
		}
		
		System.out.println(sb);
	}

}