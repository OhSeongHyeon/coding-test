import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	int[] asa = new int[n]; // Accumulated Sum Array
    	st = new StringTokenizer(br.readLine());
    	asa[0] = Integer.parseInt(st.nextToken());
    	
    	for (int i = 1; i < n; i++) {
			asa[i] = asa[i-1] + Integer.parseInt(st.nextToken());
		}
    	
    	while(m-- > 0) {
    		st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken()) - 1;
    		int b = Integer.parseInt(st.nextToken()) - 1;
    		sb.append(a==0 ? asa[b] : asa[b] - asa[a-1]).append("\n");
    	}
    	
    	System.out.println(sb);
    }

}