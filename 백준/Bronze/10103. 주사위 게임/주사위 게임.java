import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	int sangduck = 100;
    	int changyoeng = 100;
    	
    	while(n-- > 0) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken());
    		int b = Integer.parseInt(st.nextToken());
    		
    		if(a > b) {
    			changyoeng -= a;
    		}else if(a < b) {
    			sangduck -= b;
    		}
    	}
    	
    	System.out.printf("%d\n%d", sangduck, changyoeng);
    }

}