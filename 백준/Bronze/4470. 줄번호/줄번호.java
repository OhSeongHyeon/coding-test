import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int ln = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= ln; i++) {
			sb.append(String.format("%d. %s\n", i, br.readLine()));
		}
		
		System.out.println(sb);
	}

}