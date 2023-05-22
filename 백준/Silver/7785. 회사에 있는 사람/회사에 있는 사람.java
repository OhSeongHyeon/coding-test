import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int n = Integer.parseInt(br.readLine());
        	StringBuilder sb = new StringBuilder();
        	Map<String, String> mem = new TreeMap<>(Collections.reverseOrder());
        	
        	for (int i = 0; i < n; i++) {
				String[] inp = br.readLine().split("\\s");
				mem.put(inp[0], inp[1]);
			}
        	
        	mem.forEach((k, v) -> {
        		if("enter".equals(v)) {
        			sb.append(k).append("\n");
        		}
        	});
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}