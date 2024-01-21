import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			String[] sp = br.readLine().split("\\s");
			int evenSum = 0;
			int evenMin = Integer.MAX_VALUE;
			
			for (int j = 0; j < sp.length; j++) {
				int n = Integer.parseInt(sp[j]);
				
				if(n%2 == 0) {
					evenSum += n;
					evenMin = Math.min(evenMin, n);
				}
			}
			
			sb.append(evenSum)
				.append(" ")
				.append(evenMin)
				.append("\n");
		}
		
		System.out.println(sb);
	}

}