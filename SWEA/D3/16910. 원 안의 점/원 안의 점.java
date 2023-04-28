import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		try(
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ){
            final int N = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i <= N; i++){
                int r = Integer.parseInt(br.readLine());
                int cnt = 0;
                for (int x = 1; x <= r; x++) {
                	for (int y = 1; y <= r; y++) {
                    	if( (x*x)+(y*y) <= r*r ) {
                    		cnt++;
                    	}
    				}
				}
                cnt = (cnt*4) + 1 + (r*4);
                sb.append(String.format("#%d %d\n", i, cnt));
            }
            
            bw.write(sb.toString());
            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
	}

}