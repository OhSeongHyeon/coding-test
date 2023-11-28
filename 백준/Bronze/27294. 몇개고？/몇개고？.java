import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] split = br.readLine().split("\\s");
		int t = Integer.parseInt(split[0]);
		int s = Integer.parseInt(split[1]);
		System.out.println((12 <= t && t <= 16 && s==0) ? 320 : 280);
    }
}