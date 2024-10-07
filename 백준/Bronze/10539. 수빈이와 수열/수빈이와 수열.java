import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] b = Arrays.stream(br.readLine().split(" "))
    		.mapToInt(Integer::parseInt)
    		.toArray();
        int[] a = new int[n];
        
        a[0] = b[0];
        int sum = a[0];
        
        for (int i = 1; i < n; i++) {
            a[i] = b[i] * (i + 1) - sum;
            sum += a[i];
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(a[i]).append(" ");
        }
        
        System.out.println(sb.toString().trim());
    }
	
}