import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<String>();
		set.add("ChongChong");
		
		for (int i = 0; i < tc; i++) {
			String[] inp = br.readLine().split("\\s");
			
			if(set.contains(inp[0]) || set.contains(inp[1])) {
				set.add(inp[0]);
				set.add(inp[1]);
			}
			
		}
		
		System.out.println(set.size());
	}

}