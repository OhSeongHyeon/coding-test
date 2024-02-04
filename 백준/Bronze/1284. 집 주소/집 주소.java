import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input;
		
		while( !(input = br.readLine()).equals("0") ) {
			int width = 1;
			
			for(char c : input.toCharArray()) {
				if(c == '0') {
					width += 5;
				}else if(c == '1') {
					width += 3;
				}else {
					width += 4;
				}
			}
			
			sb.append(width).append("\n");
		}
		
		System.out.println(sb);
	}

}