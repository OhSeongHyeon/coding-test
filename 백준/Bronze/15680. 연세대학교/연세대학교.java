import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		if("0".equals(s)) {
			System.out.println("YONSEI");
		}else {
			System.out.println("Leading the Way to the Future");
		}
    }
}