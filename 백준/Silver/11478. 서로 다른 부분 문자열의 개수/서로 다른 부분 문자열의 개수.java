import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	StringBuilder sb = new StringBuilder();
        	String inp = br.readLine();
        	int sLen = inp.length();
        	Set<String> set = new HashSet<>();
        	
        	for (int i = 0; i < sLen; i++) {
				for (int j = i+1; j <= sLen; j++) {
					set.add(inp.substring(i, j));
				}
			}
        	
        	sb.append(set.size());
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }

}