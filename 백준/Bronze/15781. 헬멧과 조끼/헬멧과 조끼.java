import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int max1 = getMax(br.readLine());
		int max2 = getMax(br.readLine());
		System.out.println(max1 + max2);
	}

	private static int getMax(String s) throws IOException {
		return Arrays.stream(s.split("\\s"))
			.mapToInt(Integer::parseInt)
			.max()
			.getAsInt();
	}

}