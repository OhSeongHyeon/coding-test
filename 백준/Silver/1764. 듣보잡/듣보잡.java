import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	StringBuilder sb = new StringBuilder();
        	Map<String, Integer> mem = new TreeMap<>();
        	String[] inp = br.readLine().split("\\s");
        	int n = Integer.parseInt(inp[0]);
        	int m = Integer.parseInt(inp[1]);
        	
        	for (int i = 0; i < n+m; i++) {
        		String inp2 = br.readLine();
        		if(mem.containsKey(inp2)) {
        			mem.put(inp2, mem.getOrDefault(inp2, 0)+1);
        			continue;
        		}
        		mem.put(inp2, 0);
			}
        	
        	int cnt = 0;
        	for(String s : mem.keySet()) {
        		if(mem.get(s) >= 1) {
        			cnt++;
        			sb.append(s).append("\n");
        		}
        	}
        	sb.insert(0, String.format("%d\n", cnt));
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}