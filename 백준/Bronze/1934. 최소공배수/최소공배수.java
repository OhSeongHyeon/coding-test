import java.io.*;
import java.util.*;

public class Main {
	// 백준
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	StringBuilder sb = new StringBuilder();
        	int tc = Integer.parseInt(br.readLine());
        	
        	for (int i = 0; i < tc; i++) {
        		String[] inp = br.readLine().split("\\s");
        		int n = Integer.parseInt(inp[0]);
        		int m = Integer.parseInt(inp[1]);
        		
        		sb.append(n*m/gcd(n, m)).append("\n");
			}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
    
    public static int gcd(int a, int b){
        if (b==0){
            return a;
        }
        return gcd(b, a%b);
    }
}