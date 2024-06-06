import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		Map<String, String> map = Arrays.stream(br.readLine().split("\\s"))
			.collect(Collectors.toMap(k -> k, v -> v.toLowerCase()));
		String res = s.chars()
			.mapToObj(c -> String.valueOf((char) c))
			.map(c -> map.getOrDefault(c, c))
			.collect(Collectors.joining());

		System.out.println(res);
	}

}