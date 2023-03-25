import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	int[] chess = {1, 1, 2, 2, 2, 8};
        	String[] input = br.readLine().split(" ");
        	int[] intArr = Arrays.stream(input)
        			.mapToInt(Integer::parseInt)
        			.toArray();
        	StringBuilder sb = new StringBuilder();
        	for (int i = 0; i < chess.length; i++) {
				int piece = chess[i] - intArr[i];
				sb.append(piece).append(" ");
			}
        	
        	bw.append(sb.toString());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}