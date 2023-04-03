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
        	int n = Integer.parseInt(br.readLine());
    		int ans = 1, range = 1;
            
            while(n > range) {
                range += ans++ * 6;
            }
            
            bw.write(String.valueOf(ans));
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}