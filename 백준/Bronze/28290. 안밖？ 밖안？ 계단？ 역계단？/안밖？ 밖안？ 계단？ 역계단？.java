import java.util.*;
import java.io.*;

public class Main {
	
	private static Map<String, String> way = new HashMap<>();
	
	static {
		way.put("fdsajkl;", "in-out");
		way.put("jkl;fdsa", "in-out");
		way.put("asdf;lkj", "out-in");
		way.put(";lkjasdf", "out-in");
		way.put("asdfjkl;", "stairs");
		way.put(";lkjfdsa", "reverse");
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		System.out.println(way.getOrDefault(input, "molu"));
	}

}