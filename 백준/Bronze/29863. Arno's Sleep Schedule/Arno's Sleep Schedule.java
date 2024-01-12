import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sleep = Integer.parseInt(br.readLine());
		int alarm = Integer.parseInt(br.readLine());
		System.out.println(sleep < 20 ? alarm-sleep : 24-sleep+alarm);
	}
	
}