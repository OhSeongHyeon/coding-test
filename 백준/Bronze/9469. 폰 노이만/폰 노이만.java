import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int p = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while (p-- > 0) {
			double[] arr = Arrays.stream(br.readLine().split("\\s"))
				.mapToDouble(Double::parseDouble)
				.toArray();
			double res = arr[4] * (arr[1] / (arr[2] + arr[3]));
			sb.append(String.format("%d %.6f\n", (int) arr[0], res));
		}
		
		System.out.println(sb);
	}

}