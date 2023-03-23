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
			String[] firstLine = bf.readLine().split(" ");
            int arrLen = Integer.parseInt(firstLine[0]);
            int repet = Integer.parseInt(firstLine[1]);
            
            int[] arr = IntStream.rangeClosed(1, arrLen).toArray();
            
            while (repet-- > 0) {
                String[] readLine = bf.readLine().split(" ");
                int idx1 = Integer.parseInt(readLine[0]) - 1;
                int idx2 = Integer.parseInt(readLine[1]) - 1;
                
                if (idx1 == idx2) continue;
                
                arr[idx1] ^= arr[idx2];
                arr[idx2] ^= arr[idx1];
                arr[idx1] ^= arr[idx2];
            }
            
            bw.write(Arrays.toString(arr).replaceAll("[^0-9\\s]", ""));
            bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}