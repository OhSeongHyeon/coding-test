import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(tc-- > 0) {
			sb.append(br.readLine().toLowerCase()).append("\n");
		}
		
		System.out.println(sb);
	}

}