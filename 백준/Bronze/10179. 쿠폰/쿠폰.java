import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while (t-- > 0) {
			double price = Double.parseDouble(br.readLine());
			sb.append(String.format("$%.2f", Math.round(price*80.0)/100.0)).append("\n");
		}
		
		System.out.println(sb);
	}

}