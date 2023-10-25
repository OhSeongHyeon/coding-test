import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	String input = br.readLine();
        	int n = Integer.parseInt(input);
        	StringBuilder sb = new StringBuilder();
        	
        	for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					sb.append("*");
				}
				sb.append("\n");
			}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}