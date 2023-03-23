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
			int scoresLen = Integer.parseInt(br.readLine());
			int[] scores = Arrays.stream(br.readLine().split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();
			
			int max = IntStream.of(scores).max().getAsInt();
			double jujakAvg = 0;
			
			for(int score : scores) {
				jujakAvg += score * 100.0 / max;
			}
			
			jujakAvg /= scoresLen;
			
			bw.write(String.valueOf(jujakAvg));
			bw.flush();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}