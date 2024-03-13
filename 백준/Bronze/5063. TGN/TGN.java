import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(n-- > 0) {
			String[] sp = br.readLine().split("\\s");
			int r = Integer.parseInt(sp[0]);
			int e = Integer.parseInt(sp[1]);
			int c = Integer.parseInt(sp[2]);
			int l = e - c;
			
			if(r < l) {
				sb.append("advertise\n");
			}else if(r > l) {
				sb.append("do not advertise\n");
			}else {
				sb.append("does not matter\n");
			}
		}
		
		System.out.println(sb);
	}

}