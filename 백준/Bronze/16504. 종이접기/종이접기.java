import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long sum = br.lines()
			.limit(n)
			.flatMap(l -> Arrays.stream(l.split(" ")))
			.mapToLong(Long::parseLong)
			.sum();
		System.out.println(sum);
	}
	
}