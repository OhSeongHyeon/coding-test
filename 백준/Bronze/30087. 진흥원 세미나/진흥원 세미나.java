import java.util.*;
import java.io.*;

public class Main {
	
	private static final Map<String, String> CLASSROOM = new HashMap<>();
	
	static {
		CLASSROOM.put("Algorithm", "204");
		CLASSROOM.put("DataAnalysis", "207");
		CLASSROOM.put("ArtificialIntelligence", "302");
		CLASSROOM.put("CyberSecurity", "B101");
		CLASSROOM.put("Network", "303");
		CLASSROOM.put("Startup", "501");
		CLASSROOM.put("TestStrategy", "105");
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(n-- > 0) {
			sb.append(CLASSROOM.get(br.readLine())).append("\n");
		}
		
		System.out.println(sb);
    }
	
}