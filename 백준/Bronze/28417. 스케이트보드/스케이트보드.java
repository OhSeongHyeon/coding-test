import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = Integer.MIN_VALUE;
        
        while(n-- > 0) {
        	String[] sp = br.readLine().split("\\s+");
        	int rs1 = Integer.parseInt(sp[0]);
        	int rs2 = Integer.parseInt(sp[1]);
        	int sum = Arrays.stream(sp)
        		.skip(2)
        		.mapToInt(Integer::parseInt)
        		.sorted()
        		.skip(sp.length - 4)
        		.sum();
        	int s1 = rs1 < rs2 ? rs2 : rs1;
			max = Math.max(max, s1 + sum);
        }
        
		System.out.println(max);
    }

}