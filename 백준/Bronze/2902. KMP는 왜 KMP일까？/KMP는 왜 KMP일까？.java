import java.util.stream.Collectors;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String res = br.readLine()
			.chars()
			.filter(Character::isUpperCase)
			.mapToObj(c -> String.valueOf((char) c))
			.collect(Collectors.joining());
		System.out.println(res);
	}
	
}