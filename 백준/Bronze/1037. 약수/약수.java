import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int tc = Integer.parseInt(br.readLine());
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int[] arr = new int[tc];
    	
    	for (int i = 0; i < tc; i++) {
			int a = Integer.parseInt(st.nextToken());
			arr[i] = a;
		}
    	
    	Arrays.sort(arr);
    	
    	System.out.println(arr[0]*arr[tc-1]);
    }
    
}