import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double t = Double.parseDouble(br.readLine());
		System.out.println((int) Math.round(Math.pow(t/2, 2)));
	}

}