import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringBuilder sbr = new StringBuilder();
		String g = "G".repeat(n);
		String i = "I".repeat(n);
		String t = "T".repeat(n);
		String s = "S".repeat(n);
		String p = ".".repeat(n);
		
		for (int j = 1; j <= 3; j++) {
			switch (j) {
				case 1: sbr.append(g).append(p).append(p).append(p);
					break;
				case 2: sbr.append(p).append(i).append(p).append(t);
					break;
				case 3: sbr.append(p).append(p).append(s).append(p);
					break;
			}
			sb.append(sbr.append("\n").toString().repeat(n));
			sbr.setLength(0);
		}
		
		System.out.println(sb);
	}

}