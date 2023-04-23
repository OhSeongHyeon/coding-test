import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	String[] inp = br.readLine().split(" ");
        	int a1 = Integer.parseInt(inp[0]);
        	int a0 = Integer.parseInt(inp[1]);
        	int c = Integer.parseInt(br.readLine());
        	int n0 = Integer.parseInt(br.readLine());
        	int result = (a1*n0 + a0 <= c*n0) && (c>=a1) ? 1 : 0;
        	bw.write(String.valueOf(result));
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}