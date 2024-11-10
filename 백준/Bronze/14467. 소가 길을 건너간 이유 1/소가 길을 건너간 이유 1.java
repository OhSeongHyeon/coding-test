import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> pos = new HashMap<>();
        int cnt = 0;
        
        while(n-- > 0) {
        	String[] sp = br.readLine().split(" ");
        	int c = Integer.parseInt(sp[0]);
        	int p = Integer.parseInt(sp[1]);
        	if(pos.containsKey(c)) {
        		cnt += (pos.get(c) != p) ? 1 : 0;
        	}
        	pos.put(c, p);
        }
        
        System.out.println(cnt);
    }

}