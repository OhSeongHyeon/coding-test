import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		try (
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		) {
			bf.readLine();
			String[] elementLine = bf.readLine().split(" ");
			
			List<Integer> list = Stream.of(elementLine)
					.mapToInt(Integer::parseInt)
					.boxed()
					.collect(Collectors.toList());
			list.sort(Comparator.naturalOrder());
			
			StringBuilder sb = new StringBuilder();
			sb.append(Collections.min(list) + " " + Collections.max(list));
			
			bw.write(sb.toString());
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}