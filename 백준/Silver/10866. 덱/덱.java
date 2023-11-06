import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int l = Integer.parseInt(br.readLine());
        	StringBuilder sb = new StringBuilder();
        	Deque<Integer> deque = new LinkedList<>();
        	StringTokenizer st;
        	
        	while(l-- > 0) {
        		st = new StringTokenizer(br.readLine());
        		String order = st.nextToken();
        		
        		switch (order) {
					case "push_front": deque.offerFirst(Integer.parseInt(st.nextToken()));
						continue;
					case "push_back": deque.offerLast(Integer.parseInt(st.nextToken()));
						continue;
					case "pop_front": sb.append(deque.isEmpty() ? -1 : deque.pollFirst());
						break;
					case "pop_back": sb.append(deque.isEmpty() ? -1 : deque.pollLast());
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
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}