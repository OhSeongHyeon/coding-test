import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		System.out.println("n".equals(input) || "N".equals(input) ? "Naver D2" : "Naver Whale");
    }
	
}