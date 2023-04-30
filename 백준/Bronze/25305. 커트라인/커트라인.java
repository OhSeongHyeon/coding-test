import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		){
        	String[] inp1 = br.readLine().split("\\s");
        	int n = Integer.parseInt(inp1[0]);
        	int k = Integer.parseInt(inp1[1]);
        	String[] inp2 = br.readLine().split("\\s");
        	int[] arr =Arrays.stream(inp2)
        		.mapToInt(Integer::parseInt)
        		.sorted()
        		.toArray();
        	bw.write(String.valueOf(arr[n-k]));
        	bw.flush();
        }catch(IOException ioe) {
        	ioe.printStackTrace();
        }
    }
}