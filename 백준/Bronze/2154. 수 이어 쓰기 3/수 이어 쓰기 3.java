import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String rl = br.readLine();
        String s = IntStream.rangeClosed(1, Integer.parseInt(rl))
        	.mapToObj(String::valueOf)
        	.collect(Collectors.joining());
        System.out.println(s.indexOf(rl) + 1);
    }
	
}