import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp = br.readLine().split(" ");
		int n = Integer.parseInt(sp[0]);
		int k = Integer.parseInt(sp[1]);
		int[][] stds = new int[6][2]; // [idx:grade-1][0:girl, 1:boy]
		int res = 0;
		
		for (int i = 0; i < n; i++) {
			String[] sp1 = br.readLine().split(" ");
			int s = Integer.parseInt(sp1[0]);
			int y = Integer.parseInt(sp1[1]);
			stds[y-1][s]++;
		}
		
		for (int[] gen : stds) {
			for (int genCnt : gen) {
				res += genCnt%k == 0 ? genCnt/k : genCnt/k + 1;
			}
		}
		
		System.out.println(res);
	}

}