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
			String[] firstLine = bf.readLine().split(" ");
			String[] elementLine = bf.readLine().split(" ");
			
			int arrLen = Integer.parseInt(firstLine[0]);
			int axisNum = Integer.parseInt(firstLine[1]);
			
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < arrLen; i++) {
				int el = Integer.parseInt(elementLine[i]);
				if( axisNum > el ) {
					sb.append(el + " ");
				}
			}
			
			bw.write(sb.toString());
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}