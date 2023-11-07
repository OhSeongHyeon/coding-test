import java.io.*;

public class Main {

    public static void main(String[] args) {
        try(
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int n = Integer.parseInt(br.readLine());
        	StringBuilder sb = new StringBuilder();
        	
        	while(n-- > 0) {
        		String rl = br.readLine();
        		while(rl.contains("()")) {
        			rl = rl.replaceAll("\\(\\)", "");
        		}
        		sb.append(rl.isEmpty() ? "YES" : "NO").append("\n");
        	}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(IOException ioe) {
        	ioe.printStackTrace();
		}
    }
}