import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		while(n-- > 0) {
			String in = br.readLine();
			if( !"anj".equals(in) ) continue;
			System.out.println("뭐야;");
			return;
		}
		
		System.out.println("뭐야?");
	}
	
}