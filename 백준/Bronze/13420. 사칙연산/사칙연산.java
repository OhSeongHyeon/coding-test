import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		while(t-- > 0) {
			String[] sp = br.readLine().split("\\s");
			long a = Long.parseLong(sp[0]);
			long b = Long.parseLong(sp[2]);
			long c = Long.parseLong(sp[4]);
			
			switch(sp[1]) {
				case "+": sb.append(a+b == c ? "correct\n" : "wrong answer\n");
					break;
				case "-": sb.append(a-b == c ? "correct\n" : "wrong answer\n");
					break;
				case "*": sb.append(a*b == c ? "correct\n" : "wrong answer\n");
					break;
				case "/": sb.append(a/b == c ? "correct\n" : "wrong answer\n");
					break;
			}
		}

		System.out.println(sb);
	}

}