import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	StringBuilder sb = new StringBuilder();
        	int n = Integer.parseInt(br.readLine());
        	String[] nInp = br.readLine().split("\\s");
        	int m = Integer.parseInt(br.readLine());
        	String[] mInp = br.readLine().split("\\s");
        	Set<Integer> set = new TreeSet<>();
        	
        	for (int i = 0; i < n; i++) {
				int ne = Integer.parseInt(nInp[i]);
				set.add(ne);
			}
        	
        	for (int i = 0; i < m; i++) {
        		int me = Integer.parseInt(mInp[i]);
        		if(set.contains(me)) {
        			sb.append(1);
        		}else {
        			sb.append(0);
        		}
        		sb.append("\n");
			}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}