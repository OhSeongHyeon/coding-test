import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> patterns = new LinkedHashMap<>();
        patterns.put("TTT", 0);
        patterns.put("TTH", 0);
        patterns.put("THT", 0);
        patterns.put("THH", 0);
        patterns.put("HTT", 0);
        patterns.put("HTH", 0);
        patterns.put("HHT", 0);
        patterns.put("HHH", 0);
        
        while(p-- > 0) {
        	String s = br.readLine();
        	int len = s.length();
        	
        	for (int i = 0; i <= len - 3; i++) {
				String part = s.substring(i, i+3);
				patterns.put(part, patterns.get(part) + 1);
			}
        	
        	patterns.forEach((k, v) -> {
        		sb.append(v).append(" ");
        		patterns.put(k, 0);
        	});
        	
        	sb.setLength(sb.length() - 1);
        	sb.append("\n");
        }
        
        System.out.print(sb);
    }

}