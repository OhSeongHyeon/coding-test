import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split("\\s");
		int n = Integer.parseInt(sp[0]);
		int k = Integer.parseInt(sp[1]);
		StringBuilder sb = new StringBuilder("<");
		Queue<Integer> queue = new LinkedList<>();
		
		for (int i = 1; i <= n; i++) {
			queue.offer(i);
		}
		
		for (int i = 1; !queue.isEmpty(); i++) {
			if(i%k == 0 || !queue.offer(queue.poll())) {
				sb.append(queue.poll()).append(", ");
			}
		}
		
		System.out.println(sb.delete(sb.length()-2, sb.length()).append(">"));
	}

}