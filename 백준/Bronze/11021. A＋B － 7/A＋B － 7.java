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
			StringBuilder stringBuilder = new StringBuilder();
			int len = Integer.parseInt(bf.readLine());
			
			for (int i = 1; i <= len; i++) {
				StringTokenizer strToken = new StringTokenizer(bf.readLine());
				
				int num1 = Integer.parseInt(strToken.nextToken());
				int num2 = Integer.parseInt(strToken.nextToken());
				
				stringBuilder.append("Case #" + i + ": ");
				stringBuilder.append(num1 + num2);
				stringBuilder.append("\n");
			}
			
			bw.write(stringBuilder.toString());
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}