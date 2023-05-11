import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	StringBuilder sb = new StringBuilder();
        	int tc = Integer.parseInt(br.readLine());
        	
        	for (int i = 1; i <= tc; i++) {
        		sb.append(String.format("#%d ", i));
        		
        		Set<Integer> set = new TreeSet<>();
        		String[] inp = br.readLine().split("\\s");
        		for (int j = 0; j < inp.length; j++) {
					set.add(Integer.parseInt(inp[j]));
				}
        		Object[] arr = set.toArray();
        		int max = (int) arr[arr.length - 1];
        		
        		sb.append(max).append("\n");
			}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}