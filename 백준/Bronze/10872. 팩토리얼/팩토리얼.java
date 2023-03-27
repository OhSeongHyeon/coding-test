import java.io.*;

public class Main {
	
	public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int num = Integer.parseInt(br.readLine());
        	int fac = factorial(num);
        	bw.write(String.valueOf(fac));
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }

	private static int factorial(int num) {
		if(num <= 1) {
			return 1;
		}
		return num * factorial(num - 1);
	}
}