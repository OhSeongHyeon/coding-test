import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try (
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		) {
			StringBuilder sb = new StringBuilder();
			
			StringTokenizer firstLine = new StringTokenizer(bf.readLine());
			
			int basketArrLen = Integer.parseInt(firstLine.nextToken());
			int numberOfActions = Integer.parseInt(firstLine.nextToken());
			
			int[] basketArr = new int[basketArrLen];
			
			for (int i = 1; i <= numberOfActions; i++) {
				StringTokenizer way = new StringTokenizer(bf.readLine());
				int firstRange = Integer.parseInt(way.nextToken());
				int lastRange = Integer.parseInt(way.nextToken());
				int ballNum = Integer.parseInt(way.nextToken());
				
				for (int j = firstRange-1; j < lastRange; j++) {
					basketArr[j] = ballNum;
				}
			}
			
			for (int i = 0; i < basketArr.length; i++) {
				String output = Integer.toString(basketArr[i]);
				sb.append(output);
				if( i < basketArr.length ) {
					sb.append(" ");
				}
			}
			
			bw.write(sb.toString());
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}