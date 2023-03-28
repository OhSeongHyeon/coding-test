import java.io.*;

public class Main {

	public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	String[] input = br.readLine().split(" ");
        	int sum = 0;
        	for (int i = 0; i < input.length; i++) {
        		int n = Integer.parseInt(input[i]);
				sum += n * n;
			}
        	
        	bw.write(String.valueOf(sum%10));
			bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}