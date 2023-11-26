import java.io.*;

public class Main {
	
	private static final char[] CH_ARR_KOREA = {'K', 'O', 'R', 'E', 'A'};
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		System.out.println(findLongestKorea(input.toCharArray(), 0, 0, 0));
	}

	private static int findLongestKorea(char[] s, int sIdx, int cakIdx, int korLen) {
		if(sIdx >= s.length) {
			return korLen;
		}else if(s[sIdx] == CH_ARR_KOREA[cakIdx]) {
			return findLongestKorea(s, sIdx+1, (cakIdx+1)%CH_ARR_KOREA.length, korLen+1);
		}
		return findLongestKorea(s, sIdx+1, cakIdx, korLen);
	}
}