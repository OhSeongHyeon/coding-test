import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	StringBuilder sb = new StringBuilder();
        	String[] inp = br.readLine().split("\\s");
        	String[] aInp = br.readLine().split("\\s");
        	String[] bInp = br.readLine().split("\\s");
        	int al = Integer.parseInt(inp[0]);
        	int bl = Integer.parseInt(inp[1]);
        	Map<Integer, Integer> a = new HashMap<>();
        	Map<Integer, Integer> b = new HashMap<>();
        	
        	for (int i = 0; i < al; i++) {
        		int e = Integer.parseInt(aInp[i]);
        		a.put(e, 0);
			}
        	
        	for (int i = 0; i < bl; i++) {
        		int e = Integer.parseInt(bInp[i]);
        		b.put(e, 0);
			}
        	
        	int aCnt = 0;
        	int bCnt = 0;
        	
        	for (int e : b.keySet()) {
				if(a.containsKey(e)) {
					aCnt++;
				}
			}
        	
        	for (int e : a.keySet()) {
				if(b.containsKey(e)) {
					bCnt++;
				}
			}
        	
        	sb.append(al-aCnt + bl-bCnt);
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}