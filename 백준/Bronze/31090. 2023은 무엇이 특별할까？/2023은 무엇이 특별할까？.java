import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {
			String rl = br.readLine();
			int n = Integer.parseInt(rl);
			int npo = n + 1;
			//int r = n%100;
			int len = rl.length();
			int r = Integer.parseInt(rl.substring(len-2, len));
			sb.append(npo%r==0 ? "Good\n" : "Bye\n");
		}
		
		System.out.println(sb);
	}

}