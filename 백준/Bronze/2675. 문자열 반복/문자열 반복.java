import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
    public static void main(String[] args) {
    	try(
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		){
    		int testCaseNum = Integer.parseInt(br.readLine());
    		StringBuilder sb = new StringBuilder();
    		
    		while( testCaseNum-- > 0 ) {
    			String[] readLine = br.readLine().split(" ");
    			int repet = Integer.parseInt(readLine[0]);
    			String[] strs = readLine[1].split("");
    			
    			for(String s : strs) {
    				for(int i = 0; i < repet; i++) {
    					sb.append(s);
    				}
    			}
    			sb.append("\n");
    		}
    		
    		bw.write(sb.toString());
    		bw.flush();
    	}catch(IOException ioe) {
    		ioe.printStackTrace();
    	}
    }
}