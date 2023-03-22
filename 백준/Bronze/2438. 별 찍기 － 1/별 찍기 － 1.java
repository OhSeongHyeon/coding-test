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
			String firstLine = bf.readLine();
			int line = Integer.parseInt(firstLine);
			StringBuilder stringBuilder = new StringBuilder();
			for (int i = 1; i <= line; i++) {
				int j = 1;
				while (true) {
					stringBuilder.append("*");
					j++;
					if( i < j ) {
						stringBuilder.append("\n");
						break;
					}
				}
			}
			bw.write(stringBuilder.toString());
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}