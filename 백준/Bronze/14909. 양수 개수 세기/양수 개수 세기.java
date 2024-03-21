import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long cnt = Arrays.stream(br.readLine().split("\\s"))
			.mapToInt(Integer::parseInt)
			.filter(i -> i > 0)
			.count();
		System.out.println(cnt);
	}

}