import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
        int l = arr[n - 1];
        int cnt = 1;
        
        for (int i = n - 2; i >= 0; i--) {
			if(arr[i] > l) {
				cnt++;
				l = Math.max(l, arr[i]);
			}
		}
        
        System.out.println(cnt);
    }
	
}