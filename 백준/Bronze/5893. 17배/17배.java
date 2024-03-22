import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		String padding = "0000";
		String a = in + padding;
		String b = padding + in;
		StringBuilder sb = new StringBuilder();
		int len = in.length() + padding.length();
		int lift = 0;
		
		for (int i = len - 1; i >= 0; i--) {
			int s = (a.charAt(i) - '0') + (b.charAt(i) - '0') + lift;
			sb.append(s > 1 ? s%2 : s);
			lift = s > 1 ? 1 : 0;
		}
		sb.append(lift == 1 ? "1" : "");
		
		System.out.println(sb.reverse());
	}

}