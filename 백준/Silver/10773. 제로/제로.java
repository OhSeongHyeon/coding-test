import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < tc; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) {
				stack.pop();
				continue;
			}
			stack.push(n);
		}
		
		int sum = 0;
		for (Integer i : stack) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
