import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(n-- > 0) {
			String[] spa = br.readLine().split("\\s");
			int a = Integer.parseInt(spa[0]);
			int b = Integer.parseInt(spa[1]);
			int x = Integer.parseInt(spa[2]);
			sb.append(a*(x-1)+b).append("\n");
		}
		
		System.out.println(sb);
    }
}