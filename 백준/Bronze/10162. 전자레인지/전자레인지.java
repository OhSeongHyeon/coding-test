import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		System.out.println(t%10 != 0 ? -1 : String.format("%d %d %d", t/300, t%300/60, t%300%60/10));
	}
	
}