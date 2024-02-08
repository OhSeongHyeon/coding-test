import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int accMul = Arrays.stream(br.readLine().split("\\s"))
    		.mapToInt(Integer::parseInt)
    		.reduce(1, (a, b) -> a * b);
    	System.out.println(accMul - 1);
    }

}