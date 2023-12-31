import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long mul = Arrays.stream(br.readLine().split("\\s"))
			.mapToLong(Long::parseLong)
			.reduce(1, (a, b) -> a * b);
		System.out.println(mul/2);
	}

}