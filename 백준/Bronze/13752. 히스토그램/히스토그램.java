import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(tc-- > 0) {
			int rp = Integer.parseInt(br.readLine());
			for (int i = 0; i < rp; i++) {
				sb.append("=");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}