import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] res = new int[4];
		
		for (int i = 0; i < n; i++) {
			String[] sp = br.readLine().split("\\s");
			int g = Integer.parseInt(sp[0]);
			int b = Integer.parseInt(sp[1]);
			
			if(g > 1) {
				switch (b) {
					case 1: case 2: res[0]++;
						break;
					case 3: res[1]++;
						break;
					case 4: res[2]++;
						break;
				}
			}else {
				res[3]++;
			}
		}
		
		for (int i = 0; i < res.length; i++) {
			sb.append(res[i]).append("\n");
		}
		
		System.out.println(sb);
	}

}