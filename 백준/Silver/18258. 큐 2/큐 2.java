import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Deque<Integer> deque = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while(n-- > 0) {
			st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
				case "push": deque.offerLast(Integer.parseInt(st.nextToken()));
					continue;
				case "pop": sb.append(deque.isEmpty() ? -1 : deque.pollFirst());
					break;
				case "size": sb.append(deque.size());
					break;
				case "empty": sb.append(deque.isEmpty() ? 1 : 0);
					break;
				case "front": sb.append(deque.isEmpty() ? -1 : deque.peekFirst());
					break;
				case "back": sb.append(deque.isEmpty() ? -1 : deque.peekLast());
					break;
			}
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
	}

}