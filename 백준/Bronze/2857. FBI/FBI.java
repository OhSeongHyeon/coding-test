import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= 5; i++) {
			String in = br.readLine();
			if(in.contains("FBI")) {
				sb.append(i).append(i < 5 ? " " : "");
			}
		}
		
		System.out.println(sb.length() == 0 ? "HE GOT AWAY!"  : sb.toString());
	}

}
