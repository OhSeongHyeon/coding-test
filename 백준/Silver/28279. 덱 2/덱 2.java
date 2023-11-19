import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Deque<Integer> deque = new LinkedList<>();
		
		while(n-- > 0) {
			st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
				case "1": deque.offerFirst(Integer.parseInt(st.nextToken()));
					continue;
				case "2": deque.offerLast(Integer.parseInt(st.nextToken()));
					continue;
				case "3": sb.append(deque.isEmpty() ? -1 : deque.pollFirst());
					break;
				case "4": sb.append(deque.isEmpty() ? -1 : deque.pollLast());
					break;
				case "5": sb.append(deque.size());
					break;
				case "6": sb.append(deque.isEmpty() ? 1 : 0);
					break;
				case "7": sb.append(deque.isEmpty() ? -1 : deque.peekFirst());
					break;
				case "8": sb.append(deque.isEmpty() ? -1 : deque.peekLast());
					break;
			}
			sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}