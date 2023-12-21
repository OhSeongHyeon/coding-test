import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		while(n-- > 0) {
			String input = br.readLine();
			if(input.indexOf('S') != -1) {
				System.out.println(input);
				return;
			}
		}
    }

}