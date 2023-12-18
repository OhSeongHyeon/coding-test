import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(br.readLine()) % 10;
        long cnt = Arrays.stream(br.readLine().split("\\s"))
	    	.mapToInt(Integer::parseInt)
	    	.filter(i -> d == i%10)
	    	.count();
        System.out.println(cnt);
    }

}