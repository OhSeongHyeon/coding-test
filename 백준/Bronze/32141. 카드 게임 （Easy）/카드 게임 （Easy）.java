import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		int n = Integer.parseInt(sp[0]);
		int h = Integer.parseInt(sp[1]);
		String[] sp1 = br.readLine().split(" ");
		int cnt = -1;
		
		for (int i = 0; i < n; i++) {
			if((h -= Integer.parseInt(sp1[i])) <= 0) {
				cnt = i + 1;
				break;
			}
		}
		
		System.out.println(cnt);
	}
	
}