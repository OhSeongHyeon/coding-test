import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String name = "";
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < n; i++) {
			String in = br.readLine();
			String[] sp = in.split(" ");
			int dif = Integer.parseInt(sp[1]);
			
			if(min >= dif) {
				name = sp[0];
				min = dif;
			}
		}
		
		System.out.println(name);
	}
	
}