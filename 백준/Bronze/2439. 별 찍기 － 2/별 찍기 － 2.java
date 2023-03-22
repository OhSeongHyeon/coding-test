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
			int starline = Integer.parseInt(firstLine);
			StringBuilder starBuilder = new StringBuilder();
			for (int i = 1; i <= starline; i++) {
				for (int j = starline-i; j >= 1; j--) {
					starBuilder.append(" ");
				}
				for (int k = 1; k <= i; k++) {
					starBuilder.append("*");
				}
				starBuilder.append("\n");
			}
			bw.write(starBuilder.toString());
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}