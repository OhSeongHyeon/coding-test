import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
    	try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		){
    		String[] rls = br.readLine().split(" ");
    		int arrLen = Integer.parseInt(rls[0]);
    		int caseNum = Integer.parseInt(rls[1]);
    		int[] arr = IntStream.rangeClosed(1, arrLen).toArray();
    		
    		while(caseNum-- > 0) {
    			String[] inputs = br.readLine().split(" ");
    			int begin = Integer.parseInt(inputs[0]);
    			int end = Integer.parseInt(inputs[1]);
    			int mid = Integer.parseInt(inputs[2]);
    			int[] temp = new int[mid-begin];
    			
    			for(int i = begin-1, k = 0; i < mid-1; i++, k++) {
    				temp[k] = arr[i];
    			}
    			
    			for(int l = begin-1, m = mid-1; m < end; l++, m++) {
    				arr[l] = arr[m];
    				if( m == end-1 ) {
    					l++;
    	    			for (int j = 0; j < temp.length; j++) {
    	    				arr[l+j] = temp[j];
    					}
    				}
    			}
    		}
    		
    		bw.write(Arrays.toString(arr).replaceAll("[\\[\\,\\]]", ""));
    		bw.flush();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}