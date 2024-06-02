import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int len = n-2;
		String inp = br.readLine();
		
		for (int i = 0; i < len; i++) {
			if( (n-i)%2 != 0 ) {
				continue;
			}
			
			String substr = inp.substring(i, n);
			int sCharLen = substr.replaceAll("[^s]", "").length();
			int tCharLen = substr.replaceAll("[^t]", "").length();
			
			if(sCharLen == tCharLen) {
				System.out.println(substr);
				return;
			}
		}
		
		//위 과정을 통해 균형 잡힌 소떡소떡으로 만들 수 없는 입력은 주어지지 않는다.
		System.out.println(inp.substring(len, n));
	}

}