import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		int n = Integer.parseInt(sp[0]);
		int k = Integer.parseInt(sp[1]);
		System.out.println(findMax(n, k));
	}
	
	private static int findMax(int n, int k) {
		return findMax(n, k, 1, 0);
	}
	
	private static int findMax(int n, int k, int i, int max) {
		if (i > k) {
			return max;
		}
		return findMax(n, k, i+1, Math.max(max, reverseNumber(n*i)));
	}
	
	private static int reverseNumber(int n) {
	    return reverseNumber(n, 0);
	}

	private static int reverseNumber(int n, int res) {
	    if (n <= 0) {
	        return res;
	    }
	    return reverseNumber(n/10, res*10 + n%10);
	}

}