import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String in;
		
		while((in = br.readLine()) != null && !in.isEmpty()) {
			String[] sp = in.split(" ");
			int a = Integer.parseInt(sp[0]);
			int b = Integer.parseInt(sp[1]);
			int c = Integer.parseInt(sp[2]);
			sb.append((c-a)/2 + a >= b ? c-b-1 : b-a-1).append("\n");
		}
		
		System.out.println(sb);
	}

}