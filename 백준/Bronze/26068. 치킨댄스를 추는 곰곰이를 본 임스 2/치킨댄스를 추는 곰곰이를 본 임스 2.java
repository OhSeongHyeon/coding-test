import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			cnt += Integer.parseInt(br.readLine().replaceAll("[^0-9]", "")) <= 90 ? 1 : 0;
		}
		
		System.out.println(cnt);
	}

}