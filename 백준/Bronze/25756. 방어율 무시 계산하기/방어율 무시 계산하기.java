import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sp = br.readLine().split("\\s");
		StringBuilder sb = new StringBuilder();
		double v = 0.0;
		
		for (int i = 0; i < n; i++) {
			double a = Double.parseDouble(sp[i]);
			double ai = 100.0 - a;
			double vi = 100.0 - v;
			v = 100.0 - (vi * ai / 100.0);
			sb.append(v).append("\n");
		}
		
		System.out.println(sb);
	}

}