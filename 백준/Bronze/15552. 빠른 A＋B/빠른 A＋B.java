import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try (
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		) {
			String firstLine = bf.readLine();
			int len = Integer.parseInt(firstLine);

			for (int i = 0; i < len; i++) {
				String nextLine = bf.readLine();
				StringTokenizer token = new StringTokenizer(nextLine);
				
				int inputNum1 = Integer.parseInt(token.nextToken());
				int inputNum2 = Integer.parseInt(token.nextToken());
				
				int sum = inputNum1 + inputNum2;
				
				bw.write(String.format("%d\n", sum));
			}
			
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}