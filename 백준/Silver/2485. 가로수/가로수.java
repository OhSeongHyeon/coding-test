import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int n = Integer.parseInt(br.readLine());
        	int[] roadsideTrees = new int[n];
        	
        	for (int i = 0; i < n; i++) {
        		roadsideTrees[i] = Integer.parseInt(br.readLine());
			}
        	
        	int gcd = 0;
        	for (int i = 0; i < n-1; i++) {
				int d = roadsideTrees[i+1] - roadsideTrees[i];
				gcd = gcd(d, gcd);
			}
        	
        	bw.write(String.valueOf((roadsideTrees[n-1]-roadsideTrees[0])/gcd + 1-n));
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
    
    private static int gcd(int a, int b) {
    	return b==0 ? a : gcd(b, a%b);
    }

}