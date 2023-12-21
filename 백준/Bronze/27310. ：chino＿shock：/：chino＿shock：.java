import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int tlcn = input.length() + 2;
		int un = input.replaceAll("[^_]", "").length() * 5;
		System.out.println(tlcn + un);
    }

}