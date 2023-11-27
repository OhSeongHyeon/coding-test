import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] ca = br.readLine().toCharArray();
		
		for (int i = 0; i < ca.length; i++) {
			ca[i] = Character.isUpperCase(ca[i]) ? Character.toLowerCase(ca[i]) : Character.toUpperCase(ca[i]);
		}
		
		System.out.println(ca);
    }
}