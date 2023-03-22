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
			StringBuilder stringBuilder = new StringBuilder();
			
			for (int i = 1; i <= len; i++) {
				StringTokenizer strToken = new StringTokenizer(bf.readLine(), " ");
				
				int num1 = Integer.parseInt(strToken.nextToken());
				int num2 = Integer.parseInt(strToken.nextToken());
				int sum = num1 + num2;
				
				stringBuilder.append("Case #" + i + ": " + num1 + " + " + num2 + " = " + sum + "\n");
			}
			
			bw.write(stringBuilder.toString());
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}