import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int h = Integer.parseInt(st.nextToken()); // 행
		int w = Integer.parseInt(st.nextToken()); // 열
		int n = Integer.parseInt(st.nextToken()); // 세로 비움
		int m = Integer.parseInt(st.nextToken()); // 가로 비움
		int vSeat = h%(n+1)==0 ? h/(n+1) : h/(n+1) + 1;
		int hSeat = w%(m+1)==0 ? w/(m+1) : w/(m+1) + 1;
		System.out.println(vSeat*hSeat);
	}
	
}