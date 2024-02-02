import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	int ballNum = 1;
    	
    	for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if( a != b && (ballNum == a || ballNum == b) ) {
				ballNum = ballNum != a ? a : b;
			}
		}
    	
    	System.out.println(ballNum);
    }
}