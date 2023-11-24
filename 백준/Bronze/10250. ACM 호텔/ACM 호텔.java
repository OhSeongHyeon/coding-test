import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int ln = Integer.parseInt(br.readLine());
		
		while (ln-- > 0) {
			String[] split = br.readLine().split("\\s");
			int h = Integer.parseInt(split[0]);
			int n = Integer.parseInt(split[2]);
			int yy = n%h;
			int xx = yy == 0 ? n/h : n/h + 1;
			
			sb.append(yy == 0 ? h : yy)
				.append(xx >= 10 ? "" : "0")
				.append(xx)
				.append("\n");
		}
		
		System.out.println(sb);
    }
}