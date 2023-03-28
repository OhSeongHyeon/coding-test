import java.io.*;

public class Main {

	public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int n = Integer.parseInt(br.readLine());
        	StringBuilder sb = new StringBuilder();
        	for (int i = n; i >= 1; i--) {
        		sb.append(i).append("\n");
			}
        	bw.write(sb.toString());
			bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}