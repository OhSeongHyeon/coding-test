import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main {
	
	public static void main(String[] args) {
		try(
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		){
			String firstLine = br.readLine();
			StringTokenizer st = new StringTokenizer(firstLine);
			int arrLen = Integer.parseInt(st.nextToken());
			
			int[] arr = IntStream.rangeClosed(1, arrLen).toArray();
			
			int repet = Integer.parseInt(st.nextToken());
			while( repet-- > 0 ) {
				StringTokenizer st2 = new StringTokenizer(br.readLine());
				int idx1 = Integer.parseInt(st2.nextToken()) - 1;
				int idx2 = Integer.parseInt(st2.nextToken()) - 1;
				
				if( idx1 == idx2 ) continue;
				
				int tryNum = (idx2 - idx1) / 2 + 1;
				while( tryNum-- > 0 ) {
					int temp = arr[idx1];
					arr[idx1++] = arr[idx2];
					arr[idx2--] = temp;
				}
			}
			
			bw.write(Arrays.toString(arr).replaceAll("[^0-9\\s]", ""));
			bw.flush();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
}