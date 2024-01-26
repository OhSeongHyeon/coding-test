import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = {0, 0};
		
		while (n-- > 0) {
			int i = Integer.parseInt(br.readLine());
			arr[i]++;
		}
		
		System.out.println(arr[0] > arr[1] ? "Junhee is not cute!" : "Junhee is cute!");
	}

}