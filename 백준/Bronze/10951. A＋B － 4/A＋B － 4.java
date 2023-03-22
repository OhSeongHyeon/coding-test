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
			StringBuilder sb = new StringBuilder();
			String line;
			while ( (line = bf.readLine()) != null) {
				StringTokenizer input = new StringTokenizer(line);
				int num1 = Integer.parseInt(input.nextToken());
				int num2 = Integer.parseInt(input.nextToken());
				int sum = num1 + num2;
				
				sb.append(sum);
				sb.append("\n");
			}
			
			bw.write(sb.toString());
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}