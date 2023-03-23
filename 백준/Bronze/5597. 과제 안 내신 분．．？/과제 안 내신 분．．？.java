import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
	
	public static void main(String[] args) {
		try (
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		) {
            int[] arr = IntStream.rangeClosed(1, 30).toArray();
            StringBuilder sb = new StringBuilder();
            
            for (int i = 0; i < 28; i++) {
            	int subm = Integer.parseInt(bf.readLine());
				if( IntStream.of(arr).anyMatch(n -> n == subm) ) {
					arr[subm-1] = 0;
				}
			}
            
            int[] noSubm = new int[2];
            int idx = 0;
            
            for (int j = 0; j < arr.length; j++) {
				if ( arr[j] > 0 ) {
					noSubm[idx++] = arr[j];
				}
			}
            
            sb.append(Arrays.stream(noSubm).min().getAsInt())
            	.append("\n")
            	.append(Arrays.stream(noSubm).max().getAsInt());
            
            bw.write(sb.toString());
            bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}