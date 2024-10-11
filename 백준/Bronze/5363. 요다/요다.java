import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        while(n-- > 0) {
        	String[] sp = br.readLine().split("\\s");
        	int s = 2;
        	yodaCommu(sb, sp, s, sp.length);
        	yodaCommu(sb, sp, 0, s);
        	sb.setLength(sb.length() - 1);
        	sb.append("\n");
        }
        
        System.out.print(sb);
    }

	private static void yodaCommu(StringBuilder sb, String[] sp, int s, int e) {
		for (int i = s; i < e; i++) {
			sb.append(sp[i]).append(" ");
		}
	}
	
}