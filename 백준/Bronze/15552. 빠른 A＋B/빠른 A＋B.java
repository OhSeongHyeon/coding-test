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
			int len = Integer.valueOf(bf.readLine());
			
			for (int i = 0; i < len; i++) {
				String[] split = bf.readLine().split(" ");
				bw.write(Integer.valueOf(split[0]) + Integer.valueOf(split[1]) + "\n");
			}
			
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}