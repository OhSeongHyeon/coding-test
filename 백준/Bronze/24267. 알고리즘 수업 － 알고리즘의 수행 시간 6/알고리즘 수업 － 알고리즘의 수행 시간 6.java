import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
	// 백준 24267
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	long n = Long.parseLong(br.readLine());
            StringBuilder sb = new StringBuilder();
            sb.append((n*(n-1)*(n-2))/6)
            	.append("\n")
            	.append(3);
            bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}