import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	// 백준 5086번
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	StringBuilder sb = new StringBuilder();
        	while (true) {
            	String[] input = br.readLine().split(" ");
            	float n = Float.parseFloat(input[0]);
            	float m = Float.parseFloat(input[1]);
            	if( n == m ) {
            		break;
            	}
            	
            	if( m % n == 0 ) {
            		sb.append("factor");
            	}else if( n % m == 0 ) {
            		sb.append("multiple");
            	}else {
            		sb.append("neither");
            	}
        		sb.append("\n");
			}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}