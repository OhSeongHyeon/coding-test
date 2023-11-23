import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<String> set = new TreeSet<>();
		
		while(n-- > 0) {
			String rl = br.readLine();
			
			if(rl.length() == 3) {
				set.add(rl);
			}
		}
		
		System.out.println(set.toArray(String[]::new)[0]);
	}
}