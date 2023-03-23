import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) {
		try(
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
			String firstLine = br.readLine();
			int target = Integer.parseInt(br.readLine());
			bw.write(firstLine.charAt(target-1));
			bw.flush();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}