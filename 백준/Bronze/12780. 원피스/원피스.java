import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String h = br.readLine();
        String n = br.readLine();
        int cnt = 0;
        int idx = 0;

        while ((idx = h.indexOf(n, idx)) != -1) {
            cnt++;
            idx += n.length();
        }
        
        System.out.println(cnt);
	}
	
}