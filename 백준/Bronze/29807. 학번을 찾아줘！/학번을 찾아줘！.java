import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		int subjects = 5;
		int[] arr = new int[subjects];
		StringTokenizer st = new StringTokenizer(br.readLine());
		long sid = 0;
		
		// 국어, 수학, 영어, 탐구, 제2외국어 순서
		for (int i = 0; i < len; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		sid += arr[0] > arr[2] ? (arr[0]-arr[2])*508 : (arr[2]-arr[0])*108;
		sid += arr[1] > arr[3] ? (arr[1]-arr[3])*212 : (arr[3]-arr[1])*305;
		sid += arr[4]==0 ? 0 : arr[4]*707;
		System.out.println(sid*4763);
	}

}