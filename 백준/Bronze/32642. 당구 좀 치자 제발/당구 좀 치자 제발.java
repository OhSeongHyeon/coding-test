import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sp = br.readLine().split(" ");
		long res = 0;
		long rage = 0;
		
		for (int i = 0; i < n; i++) {
			rage += Integer.parseInt(sp[i]) == 1 ? +1 : -1;
			res += rage;
		}
		
		System.out.println(res);
	}

}