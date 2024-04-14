import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split("\\s");
		int a = Integer.parseInt(sp[0]);
		int b = Integer.parseInt(sp[1]);
		int c = Integer.parseInt(sp[2]);
		int cnt = Math.max(b-a, c-b) - 1;
		System.out.println(cnt);
	}

}