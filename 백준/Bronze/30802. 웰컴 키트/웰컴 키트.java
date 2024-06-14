import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] sp1 = br.readLine().split("\\s+");
        int[] tsa = Arrays.stream(sp1)
        	.mapToInt(Integer::parseInt)
        	.toArray();
        String[] sp2 = br.readLine().split("\\s+");
        int t = Integer.parseInt(sp2[0]);
        int p = Integer.parseInt(sp2[1]);
        int tbo = 0;
        int pbo1 = n/p;
        int pbo2 = n%p;
        
        for (int i = 0; i < tsa.length; i++) {
			tbo += tsa[i]%t == 0 ? tsa[i]/t : tsa[i]/t + 1;
		}
        
        System.out.printf("%d\n%d %d", tbo, pbo1, pbo2);
    }

}