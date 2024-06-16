import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		/*
		while(q-- > 0) {
			int a = Integer.parseInt(br.readLine());
			sb.append((a&(-a)) == a ? "1\n" : "0\n");
		}
		*/
		
		/*
		Map<Integer, String> map = new HashMap<>();
		for (int e = 0; e < 31; e++) {
			map.put((int) Math.pow(2, e), "1\n");
		}
		*/
		Map<Integer, String> map = IntStream.range(0, 31)
			.boxed()
			.collect(Collectors.toMap(e -> (int) Math.pow(2, e), e -> "1\n"));
		
		while(q-- > 0) {
			int a = Integer.parseInt(br.readLine());
			sb.append(map.getOrDefault(a, "0\n"));
		}
		
		System.out.println(sb);
	}
	
}
