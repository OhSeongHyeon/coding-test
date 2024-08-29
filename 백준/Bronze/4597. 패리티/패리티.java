import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in;
		StringBuilder sb = new StringBuilder();
		
		while( !"#".equals(in = br.readLine()) ) {
			sb.append(in.substring(0, in.length() - 1))
				.append(findLastBit(in))
				.append("\n");
		}
		
		sb.setLength(sb.length() - 1);
		System.out.println(sb);
	}
	
	private static int findLastBit(String s) {
		int len = s.length();
		int oneCnt = (int) s.chars()
			.limit(len - 1)
			.filter(c -> c == '1')
			.count();
		return findLastBit(oneCnt, s.charAt(len - 1));
	}

	private static int findLastBit(int oneCnt, char lastIdxParity) {
		if(lastIdxParity == 'o' && oneCnt%2 == 0) {
			return 1;
		}else if(lastIdxParity == 'e' && oneCnt%2 == 1) {
			return 1;
		}
		return 0;
	}
	
}