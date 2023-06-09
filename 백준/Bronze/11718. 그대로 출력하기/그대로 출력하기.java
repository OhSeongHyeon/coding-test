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
    		String input;
    		while( (input = br.readLine()) != null && !input.isEmpty() ) {
    			bw.write(input);
    			bw.newLine();
    		}
    		bw.flush();
    	}catch(IOException ioe) {
    		ioe.printStackTrace();
    	}
    }
}