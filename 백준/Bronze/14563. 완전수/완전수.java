import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" "))
        	.mapToInt(Integer::parseInt)
        	.toArray();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < t; i++) {
			int n = arr[i];
			List<Integer> divisors = new ArrayList<>();

	        for (int j = 1; j <= Math.sqrt(n); j++) {
	            if (n % j != 0) continue;
	            divisors.add(j);
                if (j == n / j) continue;
                divisors.add(n / j);
	        }

	        int compareTo = divisors.stream()
	        	.sorted()
	        	.limit(divisors.size() - 1)
	        	.reduce(0, (a, b) -> a + b)
	        	.compareTo(n);

			switch (compareTo) {
			case -1: sb.append("Deficient\n");
				break;
			case 0: sb.append("Perfect\n");
				break;
			case 1: sb.append("Abundant\n");
				break;
			}
		}
        
        System.out.print(sb);
    }
	
}