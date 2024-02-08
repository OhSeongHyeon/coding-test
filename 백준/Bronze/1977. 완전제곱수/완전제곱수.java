import java.io.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int m = Integer.parseInt(br.readLine());
    	int n = Integer.parseInt(br.readLine());
    	int sum = 0;
    	int min = Integer.MAX_VALUE;
    	
    	for (int i = m; i <= n; i++) {
			double sqrt = Math.sqrt(i);
			if(sqrt%1 == 0) {
				sum += i;
				min = Math.min(min, i);
			}
		}
    	
    	System.out.printf(sum > 0 ? "%d\n%d" : "-1", sum, min);
    }

}