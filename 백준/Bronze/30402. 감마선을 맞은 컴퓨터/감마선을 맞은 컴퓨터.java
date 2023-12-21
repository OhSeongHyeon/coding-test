import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 15; i++) {
			String input = br.readLine();
			if(input.indexOf('w') > -1) {
				System.out.println("chunbae");
				return;
			}else if(input.indexOf('b') > -1) {
				System.out.println("nabi");
				return;
			}else if(input.indexOf('g') > -1) {
				System.out.println("yeongcheol");
				return;
			}
		}
    }

}