import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] split = br.readLine().split("\\s");
		Stack<Integer> stack = new Stack<>();
		int turn = 1;
		
		for (int i = 0; i < n; i++) {
			int q = Integer.parseInt(split[i]);
			if(turn == q) {
				turn++;
				while (!stack.isEmpty() && turn == stack.peek()) {
                    stack.pop();
                    turn++;
                }
			}else {
				stack.push(q);
			}
		}
		
		while(!stack.isEmpty()) {
			if(turn == stack.peek()) {
				stack.pop();
				turn++;
			}else {
				System.out.println("Sad");
				return;
			}
		}
		
		System.out.println("Nice");
	}

}