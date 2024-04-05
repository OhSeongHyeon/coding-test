import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			double grd = 0;
			double gpa = 0;
			
			for (int i = 0; i < n; i++) {
				String[] insp = br.readLine().split("\\s");
				double c = Double.parseDouble(insp[0]);
				double g = Double.parseDouble(insp[1]);
				grd += c;
				gpa += c * g;
			}
			
			gpa = Math.round(gpa/grd*10.0) / 10.0;
			
			sb.append(String.format("%d %.1f\n", (int) grd, gpa));
		}
		
		System.out.println(sb);
	}

}