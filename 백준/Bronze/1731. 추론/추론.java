import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
        System.out.println(arr[1]-arr[0] == arr[2]-arr[1] ? 
    		arr[n-1] + arr[1]-arr[0] :
			arr[n-1] * (arr[1]/arr[0]));
    }
	
}