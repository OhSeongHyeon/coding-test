import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			/*
			br.readLine();
			int sum = Arrays.stream(br.readLine().split("\\s"))
				.mapToInt(Integer::parseInt)
				.sum();
			sb.append(sum).append("\n");
			*/
			int len = Integer.parseInt(br.readLine());
			String[] sp = br.readLine().split("\\s");
			int sum = 0;
			
			for (int i = 0; i < len; i++) {
				sum += Integer.parseInt(sp[i]);
			}
			
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
	}

}