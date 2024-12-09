import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = "UOS";
		int len = s.length();
		System.out.println(s.charAt(n%len == 0 ? len-1 : n%len - 1));
	}

}