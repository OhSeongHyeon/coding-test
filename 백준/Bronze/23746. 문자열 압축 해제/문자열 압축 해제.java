import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
        	String[] sp = br.readLine().split(" ");
			map.put(sp[1], sp[0]);
		}
        
        String str = br.readLine();
        int len = str.length();
        String[] sp1 = br.readLine().split(" ");
        int s = Integer.parseInt(sp1[0]);
        int e = Integer.parseInt(sp1[1]);
        
        for (int i = 0; i < len; i++) {
			sb.append(map.get(String.valueOf(str.charAt(i))));
		}
        
        System.out.println(sb.toString().substring(s-1, e));
    }

}