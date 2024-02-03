import java.io.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int t = Integer.parseInt(br.readLine());
    	StringBuilder sb = new StringBuilder();
    	
    	for (int i = 0; i < t; i++) {
			char[] ca = br.readLine().toCharArray();
			ca[0] = Character.toUpperCase(ca[0]);
			sb.append(ca).append("\n");
		}
    	
    	System.out.println(sb);
    }
}