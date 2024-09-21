import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in;
		Deque<Integer> deque = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		
		while(!(in = br.readLine()).equals("0")) {
			String[] sp = in.split(" ");
			deque.add(Integer.parseInt(sp[1]));
			
			for (int i = 2; i < sp.length; i++) {
				int n = Integer.parseInt(sp[i]);
				
				if(deque.peekLast() != n) {
					deque.add(n);
				}
			}
			
			for (int i : deque) {
				sb.append(i).append(" ");
			}
			
			sb.append("$\n");
			deque.clear();
		}
		
		System.out.println(sb);
	}
	
}