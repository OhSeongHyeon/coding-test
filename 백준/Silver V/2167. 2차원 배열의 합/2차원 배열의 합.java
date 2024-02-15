import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = createArray(br);
		int k = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(k-- > 0) {
			String[] lines = br.readLine().split("\\s");
			int iIdx = Integer.parseInt(lines[0]) - 1;
			int jIdx = Integer.parseInt(lines[1]) - 1;
			int xIdx = Integer.parseInt(lines[2]) - 1;
			int yIdx = Integer.parseInt(lines[3]) - 1;
			int sum = 0;
			
			for (int u = iIdx; u <= xIdx; u++) {
				for (int v = jIdx; v <= yIdx; v++) {
					sum += arr[u][v];
				}
			}
			
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static int[][] createArray(BufferedReader br) throws IOException {
		String[] line = br.readLine().split("\\s");
		int n = Integer.parseInt(line[0]);
		int m = Integer.parseInt(line[1]);
		int[][] arr = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			String[] lines = br.readLine().split("\\s");
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(lines[j]);
			}
		}
		
		return arr;
	}

}