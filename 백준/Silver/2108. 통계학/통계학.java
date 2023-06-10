import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		Map<Integer, Integer> map = new TreeMap<>();
		int[] arr = new int[tc];
		int sum = 0;
		
		for (int i = 0; i < tc; i++) {
			int num = Integer.parseInt(br.readLine());
			sum += num;
			arr[i] = num;
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		Arrays.sort(arr);
		
		int size = map.size();
		int[] numArr = new int[size];
		int[] modeArr = new int[size];
		int i = 0;
		int modeMax = Integer.MIN_VALUE;
		int targetModeIdx = 0;
		
		for(int key : map.keySet()) {
			int val = map.get(key);
			numArr[i] = key;
			modeArr[i] = val;
			if(val > modeMax) {
				modeMax = val;
				targetModeIdx = i;
			}
			i++;
		}
		
		int secondTargetModeIdx = 0;
		boolean isFind = false;
		for (int j = targetModeIdx+1; j < size; j++) {
			if(modeMax == modeArr[j]) {
				secondTargetModeIdx = j;
				isFind = true;
				break;
			}
		}
		
		// 평균
		System.out.println((int)Math.round((double)sum/tc));
		// 중앙값
		System.out.println(arr[tc/2]);
		// 최빈값
		if(isFind) {
			System.out.println(numArr[secondTargetModeIdx]);
		}else {
			System.out.println(numArr[targetModeIdx]);
		}
		// 범위
		System.out.println(Math.abs(numArr[0] - numArr[size-1]));
	}

}