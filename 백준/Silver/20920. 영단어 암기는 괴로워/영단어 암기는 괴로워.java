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
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int wn = Integer.parseInt(st.nextToken());
        	int wordMinLen = Integer.parseInt(st.nextToken());
        	Map<String, Integer> wordTable = new TreeMap<>();
        	
        	for (int i = 0; i < wn; i++) {
				String rl = br.readLine();
				if(rl.length() < wordMinLen) {
					continue;
				}
				wordTable.put(rl, wordTable.getOrDefault(rl, 0) + 1);
			}
        	
        	List<String> list = new ArrayList<>(wordTable.keySet());
        	
        	Collections.sort(list, (v1, v2) -> v2.length() - v1.length());
        	Collections.sort(list, (v1, v2) -> wordTable.get(v2).compareTo(wordTable.get(v1)));
        	
        	list.forEach(e -> sb.append(e).append("\n"));
        	
        	bw.write(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }

}