import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		){
        	int inp = Integer.parseInt(br.readLine());
        	int series = 666;
        	int cnt = 1;
        	while(cnt != inp) {
        		series++; // 667, 668, 669, .., 1666, ..
        		if( String.valueOf(series).contains("666") ) {
        			cnt++;
        		}
        	}
        	
        	bw.write(String.valueOf(series));
        	bw.flush();
        }catch(IOException ioe) {
        	ioe.printStackTrace();
        }
    }
}