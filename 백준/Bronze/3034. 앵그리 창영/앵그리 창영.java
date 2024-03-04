import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split("\\s");
		int t = Integer.parseInt(sp[0]);
		int w = Integer.parseInt(sp[1]);
		int h = Integer.parseInt(sp[2]);
		double max = Math.sqrt(w*w + h*h);
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			int l = Integer.parseInt(br.readLine());
			sb.append(l <= max ? "DA\n" : "NE\n");
		}
		
		System.out.println(sb);
	}

}