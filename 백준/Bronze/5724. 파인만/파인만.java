import java.util.stream.*;
import java.io.*;

//https://www.acmicpc.net/problem/5724
public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		String in;
		StringBuilder sb = new StringBuilder();
		
		while( !(in = br.readLine()).equals("0") ) {
			int n = Integer.parseInt(in);
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				sum += i*i;
			}
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
		*/
		String res = br.lines()
			.takeWhile(l -> !l.equals("0"))
			.mapToInt(Integer::parseInt)
			.map(n -> IntStream.rangeClosed(1, n).map(i -> i * i).sum())
			.mapToObj(String::valueOf)
			.collect(Collectors.joining("\n"));
		System.out.println(res);
	}
	
}