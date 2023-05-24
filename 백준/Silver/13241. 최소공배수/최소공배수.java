import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	String[] inp = br.readLine().split("\\s");
        	long a = Integer.parseInt(inp[0]);
        	long b = Integer.parseInt(inp[1]);
        	
        	bw.write(String.valueOf(lcm(a, b)));
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
    
    // 최대 공약수
    private static long gcd(long a, long b) {
    	while (b > 0) {
    		long t = a;
    		a = b;
    		b = t % b;
    	}
    	return a;
    }
    
    // 최소 공배수 : (a * b) / a와 b의 최대 공약수
    private static long lcm(long a, long b) {
    	 return (a * b) / gcd(a, b);
    }

}