import java.io.*;

//https://www.acmicpc.net/problem/18856
public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder(n + "\n");
		
		for (int i = 1; i <= n; i++) {
			if(i < n) {
				sb.append(i).append(" ");
			}else {
				for (int a = i; a < 1000; a++) {
					boolean isPrime = true;
					for (int j = 2; j <= Math.sqrt(a); j++) {
						if(a%j == 0) {
							isPrime = false;
							break;
						}
					}
					if(isPrime) {
						sb.append(a);
						break;
					}
				}
			}
		}
		
		System.out.println(sb);
	}

}