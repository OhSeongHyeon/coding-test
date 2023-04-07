import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int cn = Integer.parseInt(br.readLine());
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	
        	while(st.hasMoreTokens()) {
        		int n = Integer.parseInt(st.nextToken());
        		
        		if(n < 2) {
        			cn--;
        			continue;
        		}
        		
        		for (int i = 2; i < n; i++) {
        			if(n%i == 0) {
        				cn--;
        				break;
        			}
				}
        	}
        	
        	bw.write(String.valueOf(cn));
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}