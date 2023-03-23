import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		try (
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		) {
			Set<Integer> dist = new HashSet<Integer>();
			int repet = 10;
			while ( repet-- > 0 ) {
				int num = Integer.parseInt(bf.readLine());
				dist.add(num % 42);
			}
            bw.write(String.valueOf(dist.size()));
            bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}