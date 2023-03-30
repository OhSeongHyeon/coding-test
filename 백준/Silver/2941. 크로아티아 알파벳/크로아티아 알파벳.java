import java.io.*;

public class Main {
	
	public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	String[] croAlp = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        	String input = br.readLine();
        	for (int i = 0; i < croAlp.length; i++) {
        		String target = croAlp[i];
    			if(input.contains(target)) {
    				input = input.replace(target, "*");
        		}
			}
        	bw.write(String.valueOf(input.length()));
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}