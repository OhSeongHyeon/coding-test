import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	String[] inp = br.readLine().split("\\s");
        	int z = Integer.parseInt(inp[0]);
        	int o = Integer.parseInt(inp[1]);
        	StringBuilder sb = new StringBuilder();
        	Map<String, String> dogam = new HashMap<>();
        	String[] dogamArr = new String[z];
        	
        	for (int tc = 0; tc < z; tc++) {
        		String inp1 = br.readLine();
				dogam.put(inp1, String.valueOf(tc+1));
				dogamArr[tc] = inp1;
			}
        	
        	for (int i = 0; i < o; i++) {
				String inp2 = br.readLine();
				
				if(dogam.containsKey(inp2)) {
					sb.append(dogam.get(inp2)).append("\n");
					continue;
				}
				
				int idx = Integer.parseInt(inp2);
				sb.append(dogamArr[idx-1]).append("\n");
			}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}