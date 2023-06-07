import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	while(true) {
    		String[] inp = br.readLine().split("\\s");
    		int[] arr = Arrays.stream(inp)
    			.mapToInt(Integer::parseInt)
    			.toArray();
    		int max = 0;
    		int maxIdx = 0;
    		
    		for (int i = 0; i < arr.length; i++) {
				max = Math.max(max, arr[i]);
				if(max == arr[i]) {
					maxIdx = i;
				}
			}
    		
    		if(max == 0) {
    			return;
    		}
    		
    		int pita = 0;
    		
    		for (int i = 0; i < arr.length; i++) {
				if(i == maxIdx) {
					continue;
				}
				
				pita += arr[i] * arr[i];
			}
    		
    		if(pita == (arr[maxIdx] * arr[maxIdx])) {
    			System.out.println("right");
    		}else {
    			System.out.println("wrong");
    		}
    	}
    }
    
}