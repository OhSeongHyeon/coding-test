import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
	
	public static void main(String[] args) {
		try(
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
			String[] readLine = br.readLine().split("");
			int[] firstTimeLocation = new int[26];
			Arrays.fill(firstTimeLocation, -1);
			
			for (int i = 0; i < readLine.length; i++) {
				char c = readLine[i].charAt(0);
				if (firstTimeLocation[c - 'a'] == -1) {
					firstTimeLocation[c - 'a'] = i;
				}
			}
			
			String result = Arrays.toString(firstTimeLocation).replaceAll("[\\[\\],]", "");
			bw.write(result);
			bw.flush();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}