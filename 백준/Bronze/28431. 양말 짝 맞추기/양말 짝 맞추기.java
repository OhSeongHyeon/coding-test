import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> set = new HashSet<>();
		
		for (int i = 0; i < 5; i++) {
			String input = br.readLine();
			if(!set.add(input)) set.remove(input);
		}
		
		System.out.println(set.iterator().next());
	}

}