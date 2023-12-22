import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(br.readLine());
		char c = (char) (i + '가' - 1);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"), true);
		out.println(c);
	}
}