import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] sp = input.split("\\s");
		int statsNum = 4;
		int req = Integer.parseInt(sp[sp.length-1]) * statsNum;
		int sum = Arrays.stream(sp)
			.mapToInt(Integer::parseInt)
			.limit(statsNum)
			.sum();
		
		System.out.println(req <= sum ? 0 : req-sum);
    }

}