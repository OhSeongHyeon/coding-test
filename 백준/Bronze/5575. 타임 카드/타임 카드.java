import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int testCaseNum = 3;
		
		for (int i = 0; i < testCaseNum; i++) {
			String input = br.readLine();
			int targetIdx = 3;
			int targetWhitespaceIndex = findWhitespaceIndex(input, targetIdx);
			int goWorkTimeSec = totalSecond(input.substring(0, targetWhitespaceIndex));
			int goHomeTimeSec = totalSecond(input.substring(targetWhitespaceIndex + 1));
			int workingHours = goHomeTimeSec - goWorkTimeSec;
			sb.append(workingHours/3600).append(" ")
				.append((workingHours%3600)/60).append(" ")
				.append((workingHours%3600)%60).append("\n");
		}
		
		System.out.println(sb);
	}
	
	// n번째 공백 문자열 찾기
	private static int findWhitespaceIndex(String s, int n) {
		int wsCnt = 0;
		int sLen = s.length();
		
		for (int i = 0; i < sLen; i++) {
			if(Character.isWhitespace(s.charAt(i)) && ++wsCnt == n) {
				return i;
			}
		}
		
		return -1; // NotFound
	}
	
	// 총시간 초단위
	private static int totalSecond(String s) {
		StringTokenizer st = new StringTokenizer(s);
		int hs = Integer.parseInt(st.nextToken()) * 3600;
		int ms = Integer.parseInt(st.nextToken()) * 60;
		int ss = Integer.parseInt(st.nextToken());
		return hs + ms + ss;
	}

}