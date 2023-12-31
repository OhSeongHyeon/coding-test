import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mkt = Arrays.stream(br.readLine().split("\\s"))
			.mapToInt(Integer::parseInt)
			.sum();
		int mst = Arrays.stream(br.readLine().split("\\s"))
			.mapToInt(Integer::parseInt)
			.sum();
		System.out.println(mkt >= mst ? mkt : mst);
	}

}