import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long a = Long.parseLong(br.readLine());
		long b = Long.parseLong(br.readLine());
		long c = Long.parseLong(br.readLine());
		int[] nCnt = new int[10];
		StringBuilder sb = new StringBuilder();

		for(char cn : String.valueOf(a * b * c).toCharArray()) {
			nCnt[cn - '0']++;
		}
		
		for (int i = 0; i < nCnt.length; i++) {
			sb.append(nCnt[i]).append("\n");
		}
		
		System.out.print(sb);
	}

}