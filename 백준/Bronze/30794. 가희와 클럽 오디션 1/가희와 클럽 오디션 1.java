import java.util.*;
import java.io.*;

public class Main {
	
	private static final Map<String, Integer> JUDGMAP = new HashMap<>();
	
	static {
		JUDGMAP.put("miss", 0);
		JUDGMAP.put("bad", 200);
		JUDGMAP.put("cool", 400);
		JUDGMAP.put("great", 600);
		JUDGMAP.put("perfect", 1_000);
	}

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int lv = Integer.parseInt(st.nextToken());
		int judScore = JUDGMAP.get(st.nextToken());
		System.out.println(lv*judScore);
    }

}