import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split(" "))
			.mapToInt(Integer::parseInt)
			.toArray();
		int q = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(q-- > 0) {
			String[] sp = br.readLine().split(" ");
			int o = Integer.parseInt(sp[0]);
			if(o == 3) {
				sb.append(String.format("%d %d %d\n", arr[0], arr[1], arr[2]));
				continue;
			}
			int c = Integer.parseInt(sp[1]);
			
			switch(o) {
				case 1: addTime(arr, c);
					break;
				case 2: subTime(arr, c);
					break;
			}
		}
		
		System.out.print(sb);
	}
	
	private static void addTime(int[] arr, int sec) {
        int totalSec = arr[0] * 3600 + arr[1] * 60 + arr[2] + sec;
        arr[0] = (totalSec / 3600) % 24;
        arr[1] = (totalSec % 3600) / 60;
        arr[2] = totalSec % 60;
    }
    
    private static void subTime(int[] arr, int sec) {
        int totalSec = arr[0] * 3600 + arr[1] * 60 + arr[2] - sec;
        while (totalSec < 0) {
            totalSec += 24 * 3600;
        }
        arr[0] = (totalSec / 3600) % 24;
        arr[1] = (totalSec % 3600) / 60;
        arr[2] = totalSec % 60;
    }

}