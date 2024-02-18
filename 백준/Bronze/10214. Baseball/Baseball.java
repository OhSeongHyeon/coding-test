import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(t-- > 0) {
			int ys = 0;
			int ks = 0;
			
			for (int i = 0; i < 9; i++) {
				String[] rls = br.readLine().split("\\s");
				ys += Integer.parseInt(rls[0]);
				ks += Integer.parseInt(rls[1]);
			}
			
			if(ys == ks) {
				sb.append("Draw\n");
			}else {
				sb.append(ys > ks ? "Yonsei\n" : "Korea\n");
			}
		}
		
		System.out.println(sb);
	}

}