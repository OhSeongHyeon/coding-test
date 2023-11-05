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
        	Deque<Integer> queue = new LinkedList<>();
        	StringTokenizer st;
        	
        	while(l-- > 0) {
        		st = new StringTokenizer(br.readLine());
        		String state = st.nextToken();
        		
        		switch (state) {
					case "push": queue.offer(Integer.parseInt(st.nextToken()));
						continue;
					case "pop": sb.append(queue.isEmpty() ? -1 : queue.poll());
						break;
					case "size": sb.append(queue.size());
						break;
					case "empty": sb.append(queue.isEmpty() ? 1 : 0);
						break;
					case "front": sb.append(queue.isEmpty() ? -1 : queue.peekFirst());
						break;
					case "back": sb.append(queue.isEmpty() ? -1 : queue.peekLast());
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