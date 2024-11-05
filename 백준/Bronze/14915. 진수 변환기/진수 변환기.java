import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split(" ");
		int m = Integer.parseInt(sp[0]);
        int n = Integer.parseInt(sp[1]);
        System.out.println(convertToBase(m, n));
    }

	private static String convertToBase(int m, int n) {
        if (m == 0) return "0";

        StringBuilder res = new StringBuilder();
        while (m > 0) {
            int remd = m % n;
            if (remd >= 10) {
                res.append((char) ('A' + remd - 10));
            } else {
                res.append(remd);
            }
            m /= n;
        }
        
        return res.reverse().toString();
    }
}