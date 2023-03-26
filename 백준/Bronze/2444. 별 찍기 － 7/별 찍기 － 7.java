import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int input = Integer.parseInt(br.readLine());
        	StringBuilder sb = new StringBuilder();
        	
        	printUpStar(input, sb);
        	printDownStar(input, sb);
        	
        	bw.append(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
    
    private static StringBuilder printUpStar(int input, StringBuilder sb) {
    	for (int i = 0; i < input; i++) {
    		for (int j = 0; j < input-i-1; j++) {
    			sb.append(" ");
			}
    		for (int k = 0; k <= i+i; k++) {
    			sb.append("*");
			}
    		sb.append("\n");
		}
    	
    	return sb;
    }
    
    private static StringBuilder printDownStar(int input, StringBuilder sb) {
    	for (int i = 0; i < input-1; i++) {
    		for (int j = 0; j <= i; j++) {
    			sb.append(" ");
			}
    		for (int k = 0; k < (input*2-3)-(i+i); k++) {
    			sb.append("*");
			}
    		sb.append("\n");
		}
    	
    	return sb;
    }
}