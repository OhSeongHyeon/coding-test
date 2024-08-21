import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		int a = Integer.parseInt(sp[0]);
		int b = Integer.parseInt(sp[1]);
		int c = Integer.parseInt(sp[2]);
		System.out.println(c - b > 0 ? a / (c-b) + 1 : -1);
	}
	
}