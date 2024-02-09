import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken());
    	int k = Integer.parseInt(st.nextToken());
    	int p = Integer.parseInt(st.nextToken());
    	int len = n*k;
    	StringTokenizer bbang = new StringTokenizer(br.readLine());
    	int noCreamCnt = 0;
    	
    	for (int i = 0; i < len; i++) {
			int isCream = Integer.parseInt(bbang.nextToken());
			
			if(isCream == 0) {
				noCreamCnt++;
			}
			
			if( (i+1)%k == 0 ) {
				if(noCreamCnt >= p) {
					n--;
				}
				noCreamCnt = 0;
			}
		}
    	
    	System.out.println(n);
    }

}