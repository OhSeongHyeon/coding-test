import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean isGo = false;
		int n = Integer.parseInt(br.readLine());
		String[] sp1 = br.readLine().split("\\s");
		int x = Integer.parseInt(sp1[0]);
		int s = Integer.parseInt(sp1[1]);
		
		for (int i = 0; i < n; i++) {
			String[] sp2 = br.readLine().split("\\s");
			int c = Integer.parseInt(sp2[0]);
			int p = Integer.parseInt(sp2[1]);
			if(c <= x && p > s) {
				isGo = true;
				break;
			}
		}
		
		System.out.println(isGo ? "YES" : "NO");
	}

}