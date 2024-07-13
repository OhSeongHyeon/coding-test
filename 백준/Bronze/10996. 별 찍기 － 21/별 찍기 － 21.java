import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String s = "* ".repeat(n/2);
		sb.append(n%2 != 0 ? s + "*" : s.trim()).append("\n");
		sb.append(new StringBuilder(s).reverse()).append("\n");
		System.out.println(sb.toString().repeat(n));
	}

}