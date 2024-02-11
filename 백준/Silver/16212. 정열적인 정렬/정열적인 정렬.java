import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	br.readLine(); // 첫줄 버림
    	String res = Arrays.stream(br.readLine().split("\\s"))
    		.mapToInt(Integer::parseInt)
    		.sorted()
    		.boxed()
    		.map(String::valueOf)
    		.collect(Collectors.joining(" "));
    	System.out.println(res);
    }

}