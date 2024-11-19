import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        while (n > 0) {
            if (isGeumMinSu(n)) {
                System.out.println(n);
                return;
            }
            n--;
        }
    }
	
	private static boolean isGeumMinSu(int num) {
        String str = String.valueOf(num);
        for (char c : str.toCharArray()) {
            if (c != '4' && c != '7') return false;
        }
        return true;
    }

}