import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		try(
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		){
			String readLine = br.readLine();
			StringTokenizer st = new StringTokenizer(readLine, " ");
			int cnt = 0;
			
			while(st.hasMoreTokens()) {
				String nextToken = st.nextToken();
				if( !" ".equals(nextToken) ) {
					cnt++;
				}
			}
			
			bw.write(String.valueOf(cnt));
			bw.flush();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}