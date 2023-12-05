import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] brsp = br.readLine().split("\\s");
		int cash = Integer.parseInt(brsp[0]) * 100;
		int chocoPrice = Integer.parseInt(brsp[1]);
		System.out.println(cash >= chocoPrice ? "Yes" : "No");
    }
}