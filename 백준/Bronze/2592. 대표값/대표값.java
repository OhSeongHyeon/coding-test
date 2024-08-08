import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int loop = 10;
		int sum = 0;
		int maxFreq = 0;
		int maxFreqCnt = 0;
		Map<Integer, Integer> freqMap = new HashMap<>();
		
		for (int i = 0; i < loop; i++) {
			int n = Integer.parseInt(br.readLine());
			sum += n;
			freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
		}
		
		for (Map.Entry<Integer,Integer> entry : freqMap.entrySet()) {
			int k = entry.getKey();
			int v = entry.getValue();
			if(maxFreqCnt < v) {
				maxFreqCnt = v;
				maxFreq = k;
			}
		}
			
		System.out.printf("%d\n%d", sum/loop, maxFreq);
	}

}