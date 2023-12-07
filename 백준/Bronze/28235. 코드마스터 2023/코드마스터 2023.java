import java.util.*;
import java.io.*;

public class Main {
	
	private static final Map<String, String> CHANTS = new HashMap<>();
	
	static {
		CHANTS.put("SONGDO", "HIGHSCHOOL");
		CHANTS.put("CODE", "MASTER");
		CHANTS.put("2023", "0611");
		CHANTS.put("ALGORITHM", "CONTEST");
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(CHANTS.get(br.readLine()));
    }
	
}