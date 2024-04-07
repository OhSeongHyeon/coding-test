import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[3][2];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Arrays.stream(br.readLine().split("\\s"))
				.mapToInt(Integer::parseInt)
				.toArray();
		}
		
		//Arrays.sort(arr, (a, b) -> a[0] - b[0]);
		//Arrays.sort(arr, Comparator.comparingInt(a -> -a[0])); // 내림차순
		//Arrays.sort(arr, Comparator.comparingInt(a -> a[0])); // 오름차순
		
		int bossHP = Integer.parseInt(br.readLine()) - (arr[0][1] + arr[1][1] + arr[2][1]);
		int sec = 0;
		
		while (bossHP > 0 && ++sec > -1) {
			for (int i = 0; i < arr.length; i++) {
				if(sec%arr[i][0] == 0) {
					bossHP -= arr[i][1];
				}
			}
		}
		
		System.out.println(sec);
	}

}