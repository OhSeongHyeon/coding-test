import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(tc-- > 0) {
			String input = br.readLine();
			int min = Arrays.stream(input.split("\\s"))
				.mapToInt(Integer::parseInt)
				.min()
				.getAsInt();
			sb.append(min).append("\n");
		}
		
		System.out.println(sb);
    }

}