import java.util.*;
import java.io.*;

public class Main {
	
	private static final Map<String, Integer> ohmsTable = new HashMap<>();
	private static final String[] color = {
		"black", "brown", "red", "orange", "yellow",
		"green", "blue", "violet", "grey", "white"
	};
	
	static {
		for (int i = 0; i < color.length; i++) {
			ohmsTable.put(color[i], i);
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long ohms = ohmsTable.get(br.readLine()) * 10;
		ohms += ohmsTable.get(br.readLine());
		ohms *= Math.pow(10, ohmsTable.get(br.readLine()));
		System.out.println(ohms);
	}
	
}