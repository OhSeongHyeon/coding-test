import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		long a = Long.parseLong(br.readLine().replaceAll("\\s", ""));
		long b = Long.parseLong(br.readLine().replaceAll("\\s", ""));
		//System.out.println(a > b ? b : a);
		System.out.println(Math.min(a, b));
	}

}