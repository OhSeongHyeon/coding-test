import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine(); // trash
		int sum = Arrays.stream(br.readLine().split("\\s"))
			.mapToInt(Integer::parseInt)
			.sum();
		
		System.out.println(sum == 0 ? "Stay" : sum < 0 ? "Left" : "Right");
    }

}