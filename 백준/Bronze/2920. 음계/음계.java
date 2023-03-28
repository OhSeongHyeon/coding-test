import java.io.*;

public class Main {

	public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	String[] input = br.readLine().split(" ");
			int b = Integer.parseInt(input[0]);
			int e = Integer.parseInt(input[input.length-1]);
			int check = b - e;
			
			if( check == -7 ) {
	    		for (int i = 0; i < input.length; i++) {
	    			int bs = Integer.parseInt(input[i]);
	    			if( bs-i != 1 ) {
	    				bw.write("mixed");
	    				bw.flush();
	    				return;
	    			}
	    			if( i == input.length-1 ) {
	    				bw.write("ascending");
	    				bw.flush();
	    				return;
	    			}
				}
			}else if( check == 7 ) {
	    		for (int i = 0; i < input.length; i++) {
	    			int es = Integer.parseInt(input[i]);
	    			if( es+i != 8 ) {
	    				bw.write("mixed");
	    				bw.flush();
	    				return;
	    			}
	    			if( i == input.length-1 ) {
	    				bw.write("descending");
	    				bw.flush();
	    				return;
	    			}
				}
			}
			
			bw.write("mixed");
			bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}
