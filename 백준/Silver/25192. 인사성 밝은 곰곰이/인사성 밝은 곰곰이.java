import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int tc = Integer.parseInt(br.readLine());
    	Set<String> set = new HashSet<>();
    	int cnt = 0;
    	
    	for (int i = 0; i < tc; i++) {
			String log = br.readLine();
			
			if("ENTER".equals(log)) {
				cnt += set.size();
				set.clear();
				continue;
			}
			
			set.add(log);
		}
    	
    	cnt += set.size();
    	
    	System.out.println(cnt);
    }
    
}