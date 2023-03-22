import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		try (
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		) {
			StringBuilder sb = new StringBuilder();
			
			int[] arr = new int[9];
			
			for (int i = 0; i < 9; i++) {
				int num = Integer.parseInt(bf.readLine());
				arr[i] = num;
			}
			
			int max = arr[0];
			int index = 1;
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if ( arr[i] < arr[j] && max < arr[j] ) {
						max = arr[j];
						index = j+1;
					}
				}
			}
			
			sb.append(max + "\n" + index);
			bw.write(sb.toString());
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}