import java.io.*;

public class Main {

    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		){
        	while(true) {
        		int n = Integer.parseInt(br.readLine());
        		if(n==0) {
        			break;
        		}
        		
        		String n2s = String.valueOf(n);
        		StringBuilder sb = new StringBuilder();
        		String n2r = sb.append(n).reverse().toString();
        		if(n2s.equals(n2r)) {
        			bw.write("yes\n");
        			continue;
        		}
        		bw.write("no\n");
        	}
        	bw.flush();
        }catch(IOException ioe) {
        	ioe.printStackTrace();
        }
    }
}