import java.util.*;
import java.io.*;

public class Main {
	
	private static final Set<String> PLEDGE = new HashSet<>();
	
	static {
		PLEDGE.add("Never gonna give you up");
		PLEDGE.add("Never gonna let you down");
		PLEDGE.add("Never gonna run around and desert you");
		PLEDGE.add("Never gonna make you cry");
		PLEDGE.add("Never gonna say goodbye");
		PLEDGE.add("Never gonna tell a lie and hurt you");
		PLEDGE.add("Never gonna stop");
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		while(n-- > 0) {
			String input = br.readLine();
			
			if( !PLEDGE.contains(input) ) {
				System.out.println("Yes");
				return;
			}
		}
		
		System.out.println("No");
    }
}