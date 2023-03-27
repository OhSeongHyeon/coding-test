import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
	
	public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int ln = Integer.parseInt(br.readLine());
        	int[] arr = new int[ln];
        	
        	for(int i = 0; i < ln; i++) {
        		int ipn = Integer.parseInt(br.readLine());
        		arr[i] = ipn;
        	}
        	
        	Arrays.sort(arr);
        	StringBuilder sb = new StringBuilder();
        	Arrays.stream(arr).forEach(
    			el -> sb.append(el).append("\n")
			);
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}