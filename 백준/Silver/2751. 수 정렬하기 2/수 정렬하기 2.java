import java.io.*;
import java.util.*;

public class Main {
	// 백준 
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		){
        	int n = Integer.parseInt(br.readLine());
        	int[] arr = new int[n];
        	for (int i = 0; i < n; i++) {
        		int num = Integer.parseInt(br.readLine());
        		arr[i] = num;
			}
        	
        	Arrays.sort(arr);
        	
        	StringBuilder sb = new StringBuilder();
        	for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i]).append("\n");
			}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(IOException ioe) {
        	ioe.printStackTrace();
        }
    }
}