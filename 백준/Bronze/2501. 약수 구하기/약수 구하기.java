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
        	String[] input = br.readLine().split(" ");
        	int n = Integer.parseInt(input[0]);
        	int k = Integer.parseInt(input[1]);
        	int cnt = 0;
        	int output = 0;
        	
        	for (int i = 1; i <= n; i++) {
        		if(n%i == 0) {
        			cnt++;
        			if(cnt == k) {
        				output = i;
        				break;
        			}
        		}
			}
        	
        	bw.write(String.valueOf(output));
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}