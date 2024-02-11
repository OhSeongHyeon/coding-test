import java.io.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	StringBuilder sb = new StringBuilder();
    	
    	while(n-- > 0) {
    		String input = br.readLine();
    		char c = input.charAt(input.length() - 1);
    		int nv = Character.getNumericValue(c);
    		sb.append(nv%2 == 0 ? "even\n" : "odd\n");
    	}
    	
    	System.out.println(sb);
    }

}