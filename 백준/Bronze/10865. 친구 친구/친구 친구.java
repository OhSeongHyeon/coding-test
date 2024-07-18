import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		int n = Integer.parseInt(sp[0]);
		int m = Integer.parseInt(sp[1]);
		int[] arr = new int[n+1];
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < m; i++) {
			String[] sp1 = br.readLine().split(" ");
			int a = Integer.parseInt(sp1[0]);
			int b = Integer.parseInt(sp1[1]);
			arr[a]++;
			arr[b]++;
		}
		
		for (int i = 1; i < arr.length; i++) {
			sb.append(arr[i]).append("\n");
		}
		
		System.out.println(sb);
	}

}