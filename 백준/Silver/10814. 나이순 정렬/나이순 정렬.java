import java.io.*;
import java.util.*;

public class Main {
	// 백준
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int tc = Integer.parseInt(br.readLine());
        	StringBuilder sb = new StringBuilder();
        	List<String> list = new ArrayList<>();
        	
        	for (int i = 0; i < tc; i++) {
        		list.add(br.readLine());
			}
        	
        	list.sort((m1, m2) -> {
    			int m1Age = Integer.parseInt(m1.split("\\s")[0]);
    			int m2Age = Integer.parseInt(m2.split("\\s")[0]);
    			if(m1Age != m2Age) {
    				return Integer.compare(m1Age, m2Age);
    			}
				return 0;
    		});
        	
        	for (int i = 0; i < tc; i++) {
        		sb.append(list.get(i)).append("\n");
			}
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}