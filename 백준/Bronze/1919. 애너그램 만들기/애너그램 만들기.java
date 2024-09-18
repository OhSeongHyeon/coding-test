import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = 'z' - 'a' + 1;
		int[] alphaCntArr1 = createAlphaCountArray(br.readLine(), len);
		int[] alphaCntArr2 = createAlphaCountArray(br.readLine(), len);
		int rmCnt = 0;
		
		for (int i = 0; i < len; i++) {
			rmCnt += Math.abs(alphaCntArr1[i] - alphaCntArr2[i]);
		}
		
		System.out.println(rmCnt);
	}
	
	private static int[] createAlphaCountArray(String s, int length) {
		int[] alphaCnt = new int[length];
		
		for (char c : s.toCharArray()) {
			alphaCnt[c - 'a']++;
		}
		
		return alphaCnt;
	}
	
}