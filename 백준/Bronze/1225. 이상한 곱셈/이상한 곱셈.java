import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		long res = 0;
		
		for (char ca : sp[0].toCharArray()) {
			for (char cb : sp[1].toCharArray()) {
				res += Character.getNumericValue(ca) * Character.getNumericValue(cb);
			}
		}
		
		System.out.println(res);
	}
	
}