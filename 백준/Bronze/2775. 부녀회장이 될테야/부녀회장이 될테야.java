import java.io.*;

public class Main {
	
	private static final int ARR_LENGTH = 15;
	private static final int RANGE = ARR_LENGTH - 1;
	private static final int[][] APART = new int[ARR_LENGTH][ARR_LENGTH]; // 0층부터 14층까지, 1호부터 14호까지
	
	static {
		for (int i = 1; i <= RANGE; i++) {
			APART[0][i] = i;
		}
		for (int x = 1; x <= RANGE; x++) {
			for (int y = 1; y <= RANGE; y++) {
				int sum = 0;
				for (int y1 = 1; y1 <= y; y1++) {
					sum += APART[x-1][y1];
				}
				APART[x][y] = sum;
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(APART[k][n]).append("\n");
		}
		
		System.out.println(sb);
		
		/* 복잡해서 미치는줄...
		System.out.println("===========================");
		for (int i = ARR_LENGTH -1; i >= 0; i--) {
			for (int j = 0; j < ARR_LENGTH; j++) {
				System.out.printf("%d ", APART[i][j]);
			}
			System.out.println();
		}
		*/
	}

}