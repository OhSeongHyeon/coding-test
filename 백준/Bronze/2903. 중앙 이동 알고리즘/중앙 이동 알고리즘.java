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
        	bw.write(String.valueOf((int) Math.pow(Math.pow(2, input) +1, 2)));
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}