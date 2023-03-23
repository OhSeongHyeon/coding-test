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
			int lineNum = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			while(lineNum-- > 0) {
				char[] charArr = br.readLine().toCharArray();
				sb.append(charArr[0])
					.append(charArr[charArr.length-1])
					.append("\n");
			}
			bw.write(sb.toString());
			bw.flush();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}