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
			int[] asciiArr = IntStream.rangeClosed(97,122).toArray();
			int[] firstTimeLocaion = new int[asciiArr.length];
			
			for (int i = 0; i < firstTimeLocaion.length; i++) {
				firstTimeLocaion[i] = -1;
			}
			
			for (int i = 0; i < asciiArr.length; i++) {
				for (int j = 0; j < readLine.length; j++) {
					String alphabet = String.valueOf((char) asciiArr[i]);
					if( alphabet.equals(readLine[j]) ) {
						firstTimeLocaion[i] = j;
						break;
					}
				}
			}
			
			bw.write(Arrays.toString(firstTimeLocaion).replaceAll("[^0-9\\s\\-]", ""));
			bw.flush();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}