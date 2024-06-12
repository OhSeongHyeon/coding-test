import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int n = Integer.parseInt(br.readLine());
		br.readLine();
		String res = Arrays.stream(br.readLine().split("\\s"))
			.distinct()
			.mapToInt(Integer::parseInt)
			.sorted()
			.mapToObj(String::valueOf)
			.collect(Collectors.joining(" "));
		System.out.println(res);
	}

}