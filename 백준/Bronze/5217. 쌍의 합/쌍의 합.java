import java.io.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int t = Integer.parseInt(br.readLine());
    	StringBuilder sb = new StringBuilder();
    	
    	while(t-- > 0) {
    		int n = Integer.parseInt(br.readLine());
    		sb.append(String.format("Pairs for %d:", n));
    		boolean toggle = false;
    		for (int i = 1; i <= n/2; i++) {
				if(i != n-i) {
					sb.append(String.format(toggle ? ", %d %d" : " %d %d", i, n-i));
					toggle = true;
				}
			}
    		sb.append("\n");
    	}
    	
    	System.out.println(sb);
    }

}