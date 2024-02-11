import java.io.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String input = br.readLine();
    	int cnt = 0;
    	
    	for (char c : input.toCharArray()) {
			switch (c) {
				case 'a': case 'e': case 'i': case 'o': case 'u': cnt++;
			}
		}
    	
    	System.out.println(cnt);
    }

}