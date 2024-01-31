import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Set<Integer> set = new LinkedHashSet<>();
		
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int tmp = a%10; // 1 <= a < 100, 1의 자리만 필요함
			
			while(set.add(tmp)) {
				tmp = tmp*a%10;
				/* caution
				 * 1. tmp = tmp*a%10; -> tmp = (tmp*a)%10;
				 * 2. tmp *= a%10; -> tmp = tmp*(a%10);
				 */
			}
			
			int size = set.size();
			int idx = b%size > 0 ? b%size - 1 : size - 1; // 나눈 나머지가 0이면 lastIndex
			Integer[] arr = set.toArray(Integer[]::new); // 반복문으로 일일히 꺼내기보다 배열 만드는게 나을듯
			
			sb.append(arr[idx] == 0 ? 10 : arr[idx]).append("\n");
			set.clear();
		}

		System.out.println(sb);
	}

}