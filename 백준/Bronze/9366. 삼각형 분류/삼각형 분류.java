import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= t; i++) {
			int[] arr = Arrays.stream(br.readLine().split("\\s"))
					.mapToInt(Integer::parseInt)
					.sorted()
					.toArray();
			int sub = arr[arr.length - 1];
			int cnt = 0;
			String res = "invalid!";

			for (int j = 0; j < arr.length - 1; j++) {
				sub -= arr[j];
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[j] == arr[k]) {
						cnt++;
					}
				}
			}

			if (sub < 0) {
				switch (cnt) {
				case 0: res = "scalene";
					break;
				case 1: res = "isosceles";
					break;
				case 2:
				case 3: res = "equilateral";
					break;
				}
			}

			sb.append(String.format("Case #%d: %s\n", i, res));
		}

		System.out.println(sb);
	}

}