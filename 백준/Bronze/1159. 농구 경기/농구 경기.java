import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ca = new int['z' - 'a' + 1];
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
			String rl = br.readLine();
			ca[rl.charAt(0) - 'a']++;
		}
        
        for (int i = 0; i < ca.length; i++) {
			if(ca[i] < 5) continue;
			sb.append((char) (i + 'a'));
		}
        
       System.out.println(sb.length() == 0 ? "PREDAJA" : sb);
    }

}