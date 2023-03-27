import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int sum = 0;
        	int[] inputArr = new int[9];
        	
        	for(int i = 0; i < 9; i++) {
        		int input = Integer.parseInt(br.readLine());
        		inputArr[i] = input;
        		sum += input;
        	}
        	
        	sum -= 100;
        	int target1 = 0;
        	int target2 = 0;
        	for(int j = 0; j < inputArr.length; j++) {
        		for(int k = j+1; k < inputArr.length; k++) {
            		if( sum == (inputArr[j]+inputArr[k]) ) {
            			target1 = j;
            			target2 = k;
            			break;
            		}
            	}
        	}
        	
        	int[] answer = new int[7];
        	int idx = 0;
        	for(int l = 0; l < 9; l++) {
        		if( l == target1 || l == target2 ) {
        			continue;
        		}
        		answer[idx++] = inputArr[l];
        	}
        	
        	Arrays.sort(answer);
        	
        	StringBuilder sb = new StringBuilder();
        	for(int dwarf : answer) {
        		sb.append(dwarf).append("\n");
        	}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
