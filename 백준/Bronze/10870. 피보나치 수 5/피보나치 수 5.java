import java.io.*;
import java.util.*;

public class Main {
	
	private static Map<Integer, Integer> alreadyValue = new HashMap<>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(getCalcFibonacci(n));
	}

	private static int getCalcFibonacci(int i) {
		if(i <= 1) {
			return i;
		}
		if(alreadyValue.containsKey(i)) {
			return alreadyValue.get(i);
		}
		
		int result = getCalcFibonacci(i-1) + getCalcFibonacci(i-2);
		alreadyValue.put(i, result);
		
		return result;
	}
}