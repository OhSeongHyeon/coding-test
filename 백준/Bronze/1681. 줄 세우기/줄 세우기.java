import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
        int n = Integer.parseInt(sp[0]);
        char l = sp[1].charAt(0);
        
        int cnt = 0;
        int currNum = 1;
        int max = 0;
        
        while (cnt < n) {
            if (String.valueOf(currNum).indexOf(l) == -1) {
                cnt++;
                max = currNum;
            }
            currNum++;
        }
        
        System.out.println(max);
	}
	
}