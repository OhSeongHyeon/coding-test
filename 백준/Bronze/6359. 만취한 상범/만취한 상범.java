import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        while(t-- > 0) {
        	int n = Integer.parseInt(br.readLine());
        	/*
        	boolean[] isOpen = new boolean[n+1];
        	Arrays.fill(isOpen, true);
        	int escCnt = 0;
        	
        	for (int k = 2; k <= n; k++) {
				for (int i = k; i < isOpen.length; i+=k) {
					isOpen[i] = !isOpen[i];
				}
			}
        	
        	for (int i = 1; i < isOpen.length; i++) {
				if(isOpen[i]) escCnt++;
			}
			*/
        	int escCnt = (int) Math.sqrt(n);
        	sb.append(escCnt).append("\n");
        }
        
        System.out.print(sb);
    }

}