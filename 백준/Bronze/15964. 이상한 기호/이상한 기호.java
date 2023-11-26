import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] split = br.readLine().split("\\s");
		long a = Long.parseLong(split[0]);
		long b = Long.parseLong(split[1]);
		System.out.println((a+b)*(a-b));
    }
}