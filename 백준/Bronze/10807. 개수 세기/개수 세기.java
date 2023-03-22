import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		try (
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		) {
			int arrLen = Integer.parseInt(bf.readLine());
			String[] elementLine = bf.readLine().split(" ");
			int targetNum = Integer.parseInt(bf.readLine());
			
			int eqCnt = 0;
			
			for (int i = 0; i < arrLen; i++) {
				int element = Integer.parseInt(elementLine[i]);
				if( element == targetNum ) {
					eqCnt++;
				}
			}
			
			bw.write(String.valueOf(eqCnt));
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}