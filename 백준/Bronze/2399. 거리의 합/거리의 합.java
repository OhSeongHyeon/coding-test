import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" "))
        	.mapToInt(Integer::parseInt)
        	.sorted()
        	.toArray();
        
        long totalSum = 0;
        long prefixSum = 0;
        
        for (int i = 0; i < n; i++) {
            totalSum += (long) arr[i] * i - prefixSum;
            prefixSum += arr[i];
        }
        
        System.out.println(totalSum * 2);
    }
	
}