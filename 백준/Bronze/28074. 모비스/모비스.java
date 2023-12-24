import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long res = br.readLine()
			.replaceAll("[^MOBIS]", "")
			.chars()
			.distinct()
			.count();
		System.out.println(res==5 ? "YES" : "NO");
	}

}