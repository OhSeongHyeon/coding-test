import java.util.*;
import java.util.stream.IntStream;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split("\\s");
		int n = Integer.parseInt(sp[0]);
		int k = Integer.parseInt(sp[1]);
		/*
		Queue<Integer> queue = IntStream.rangeClosed(1, n)
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));
        */
		Queue<Integer> queue = IntStream.rangeClosed(1, n)
			.collect(LinkedList::new, Queue::offer, Queue::addAll);
		StringBuilder sb = new StringBuilder("<");
		int turn = 1;

		while( !queue.isEmpty() ) {
			if(turn++%k == 0 || !queue.offer(queue.poll())) {
				sb.append(queue.poll()).append(queue.isEmpty() ? "" : ", ");
				turn = 1;
			}
		}
		
		System.out.println(sb.append(">"));
	}

}