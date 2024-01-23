import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int innerOddLen = n*2-1;
		int innerEvenLen = n*2;
		
		for (int i = 1; i <= n; i++) {
			if(i%2 != 0) {
				for (int j = 1; j <= innerOddLen; j++) {
					sb.append(j%2 != 0 ? "*" : " ");
				}
			}else {
				for (int j = 1; j <= innerEvenLen; j++) {
					sb.append(j%2 != 0 ? " " : "*");
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}