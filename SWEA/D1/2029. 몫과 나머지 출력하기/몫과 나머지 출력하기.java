import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int tc = Integer.parseInt(br.readLine());
        	StringBuilder sb = new StringBuilder();
        	
        	for (int i = 1; i <= tc; i++) {
				String[] inp = br.readLine().split("\\s");
				int a = Integer.parseInt(inp[0]);
				int b = Integer.parseInt(inp[1]);
				
				sb.append("#").append(i).append(" ")
					.append(a/b).append(" ")
					.append(a%b).append("\n");
			}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}