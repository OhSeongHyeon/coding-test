import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = 0;
        boolean isWhite = true;
        
        for (int i = 0; i < 8; i++) {
			String inp = br.readLine();
			for (int j = 0; j < 8; j++) {
				char c = inp.charAt(j);
				res += isWhite && c == 'F' ? 1 : 0;
				isWhite = !isWhite;
			}
			isWhite = !isWhite;
		}
        
        System.out.println(res);
    }

}