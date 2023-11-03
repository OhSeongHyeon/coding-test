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
        	Stack<Integer> stack = new Stack<>();
        	
        	while(l-- > 0) {
        		String input = br.readLine();
        		String[] split = input.split("\\s");
        		
        		switch (split[0]) {
					case "push": stack.push(Integer.parseInt(split[1]));
						break;
					case "pop": sb.append(stack.empty() ? -1 : stack.pop());
						break;
					case "size": sb.append(stack.size());
						break;
					case "empty": sb.append(stack.empty() ? 1 : 0);
						break;
					case "top": sb.append(stack.empty() ? -1 : stack.peek());
						break;
				}
        		
        		if( !"push".equals(split[0]) ) sb.append("\n");
        	}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}