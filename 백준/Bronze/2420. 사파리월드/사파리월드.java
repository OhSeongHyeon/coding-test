import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] split = br.readLine().split("\\s");
		System.out.println(Math.abs(Long.parseLong(split[0]) - Long.parseLong(split[1])));
    }
}