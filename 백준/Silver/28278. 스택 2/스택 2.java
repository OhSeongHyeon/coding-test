import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		) {
			int tc = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			Stack<Integer> stack = new Stack<>();
			StringTokenizer st;

			while (tc-- > 0) {
				st = new StringTokenizer(br.readLine());
				int c = Integer.parseInt(st.nextToken());
				if(c == 1) {
					stack.push(Integer.parseInt(st.nextToken()));
					continue;
				}

				switch (c) {
				case 2: sb.append(stack.empty() ? -1 : stack.pop());
					break;
				case 3: sb.append(stack.size());
					break;
				case 4: sb.append(stack.empty() ? 1 : 0);
					break;
				case 5: sb.append(stack.empty() ? -1 : stack.peek());
					break;
				}
				
				sb.append("\n");
			}
			
			bw.write(sb.toString());
			bw.flush();
		}
	}

}