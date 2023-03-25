import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			String[] inputs = br.readLine().split(" ");
			List<Integer> numbers = Arrays.stream(inputs)
				.map(Integer::parseInt)
				.map(Main::reverseInt)
				.collect(Collectors.toList());
			int max = Collections.max(numbers);
			bw.write(String.valueOf(max));
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int reverseInt(int n) {
		int reversed = 0;
		while (n > 0) {
			reversed = reversed * 10 + n % 10;
			n /= 10;
		}
		return reversed;
	}
}