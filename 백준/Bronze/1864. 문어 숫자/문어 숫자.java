import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in;
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        map.put('-', 0);
        map.put('\\', 1);
        map.put('(', 2);
        map.put('@', 3);
        map.put('?', 4);
        map.put('>', 5);
        map.put('&', 6);
        map.put('%', 7);
        map.put('/', -1);
        
        while( !(in = br.readLine()).equals("#") ) {
        	int len = in.length();
        	char[] ca = in.toCharArray();
        	int res = 0;
        	
        	for (int i = 0; i < len; i++) {
				res += map.get(ca[i]) * Math.pow(8, len-1-i);
			}
        	
        	sb.append(res).append("\n");
        }
        
        System.out.println(sb);
    }
	
}