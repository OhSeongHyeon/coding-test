import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		try(
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		) {
			String input = br.readLine();
			int year = Integer.parseInt(input);
			int res = 0;
			if( (year % 4 == 0) ) {
				res = 1;
			}
			if( (year % 100 == 0) ) {
				res = 0;
			}
			if( (year % 400 == 0) ) {
				res = 1;
			}
			bw.write(String.valueOf(res));
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}