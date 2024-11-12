import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        while(n-- > 0) {
        	String rl = br.readLine();
        	int len = rl.length();
        	double res = Double.parseDouble(rl);
        	
        	for (int i = 1; i < len; i++) {
				double pow = Math.pow(10, i);
				res = Math.round(res/pow) * pow;
			}
        	
        	sb.append((int) res).append("\n");
        }
        
        System.out.print(sb);
    }

}