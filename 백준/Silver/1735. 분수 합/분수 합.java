import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	String[] inp = br.readLine().split("\\s");
        	int a = Integer.parseInt(inp[0]);
        	int b = Integer.parseInt(inp[1]);
        	String[] inp2 = br.readLine().split("\\s");
        	int c = Integer.parseInt(inp2[0]);
        	int d = Integer.parseInt(inp2[1]);
        	
        	int numerator = a*d + b*c;
        	int denominator = b*d;
        	
        	int mod = gcd(numerator, denominator);
        	numerator /= mod;
        	denominator /= mod;
        	
        	bw.write(String.format("%d %d", numerator, denominator));
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
    
    private static int gcd(int n, int m) {
    	if(n <= m) {
    		int t = n;
    		n = m;
    		m = t;
    	}
    	if(m == 0) {
    		return n;
    	}
    	return gcd(m, n%m);
    }

}