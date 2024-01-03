import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] pn = br.readLine().split("\\s");
		String x = new StringTokenizer(br.readLine()).nextToken();
		
		for (int i = 0; i < pn.length; i++) {
			if(x.equals(pn[i])) {
				System.out.println(++i);
				return;
			}
		}
		
		System.out.println(0);
	}

}