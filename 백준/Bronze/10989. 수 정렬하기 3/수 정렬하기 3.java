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
        	int n = Integer.parseInt(br.readLine());
        	int[] arr = new int[10_000];
        	int max = 0;
        	for (int i = 0; i < n; i++) {
        		int inp = Integer.parseInt(br.readLine());
				arr[inp-1]++;
				max = Math.max(max, inp);
			}
        	
        	n = 1;
        	for (int i = 0; i < max; i++) {
				int repeat = arr[i];
				for (int j = 0; j < repeat; j++) {
					sb.append(n).append("\n");
				}
				n++;
			}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(IOException ioe) {
        	ioe.printStackTrace();
        }
    }
}