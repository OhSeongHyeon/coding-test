import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int dn = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        
        for (int i = 0; i < dn; i++) {
			int n = Integer.parseInt(st.nextToken());
			cnt += n%2 == 0 ? 1 : -1;
		}
        
        System.out.println(cnt > 0 ? "Happy" : "Sad");
    }

}