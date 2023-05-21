import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	String[] inp = br.readLine().split("\\s");
        	int n = Integer.parseInt(inp[0]);
        	int m = Integer.parseInt(inp[1]);
        	int cnt = 0;
        	Map<String, Integer> s = new HashMap<>();
        	
        	for (int i = 0; i < n; i++) {
				s.put(br.readLine(), 0);
			}
        	
        	for (int i = 0; i < m; i++) {
				if(s.containsKey(br.readLine())) {
					cnt++;
				}
			}
        	
        	bw.write(String.valueOf(cnt));
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}