import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		int last = 0;
		boolean flag = false;
		
		for (int i = 1; i <= tc; i++) {
			queue.add(i);
		}
		
		while(queue.size() >= 1) {
			last = queue.poll();
			
			if(flag) {
				queue.add(last);
				flag = !flag;
				continue;
			}
			
			flag = !flag;
		}
		
		System.out.println(last);
	}

}