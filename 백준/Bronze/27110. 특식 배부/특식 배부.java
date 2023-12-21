import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int res = n * 3 + Arrays.stream(br.readLine().split("\\s"))
	        .mapToInt(Integer::parseInt)
	        .map(i -> i - n)
	        .filter(t -> t < 0)
	        .sum();
	
		System.out.println(res);
    }

}