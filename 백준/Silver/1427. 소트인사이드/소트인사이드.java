import java.io.*;
import java.util.*;

public class Main {
	// 백준 
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		){
        	StringBuilder sb = new StringBuilder();
        	String inp = br.readLine();
        	int len = inp.length();
        	int[] arr = new int[len];
        	
        	for (int i = 0; i < len; i++) {
				arr[i] = inp.charAt(i) - '0';
			}
        	
        	Arrays.stream(arr)
        		.boxed()
        		.sorted(Collections.reverseOrder())
        		.forEach(n->sb.append(n));

        	bw.write(sb.toString());
        	bw.flush();
        }catch(IOException ioe) {
        	ioe.printStackTrace();
        }
    }
}