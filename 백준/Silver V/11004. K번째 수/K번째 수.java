import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split("\\s");
		int kIdx = Integer.parseInt(sp[1]) - 1;
		OptionalInt min = Arrays.stream(br.readLine().split("\\s"))
			.mapToInt(Integer::parseInt)
			.sorted()
			.skip(kIdx)
			.min();
		System.out.println(min.getAsInt());
	}

}