import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String[] sa = new String[len];
		
		for (int i = 0; i < len; i++) {
			sa[i] = br.readLine();
		}
		
		int k = Integer.parseInt(br.readLine());
		
		if(k == 1) {
			for (int i = 0; i < len; i++) {
				sb.append(sa[i]).append("\n");
			}
		}else if(k == 2) {
			StringBuilder rsb = new StringBuilder();
			for (int i = 0; i < len; i++) {
				sb.append(rsb.append(sa[i]).reverse()).append("\n");
				rsb.setLength(0);
			}
		}else if(k == 3) {
			for (int i = len-1; i >= 0; i--) {
				sb.append(sa[i]).append("\n");
			}
		}
		
		System.out.println(sb);
	}

}