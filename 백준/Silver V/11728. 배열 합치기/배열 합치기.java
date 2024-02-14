import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String inp = br.readLine() + " " + br.readLine();
		StringBuilder res = Arrays.stream(inp.split("\\s"))
			.mapToInt(Integer::parseInt)
			.sorted()
			.collect(StringBuilder::new, (sb, i) -> sb.append(i).append(" "), StringBuilder::append);
		System.out.println(res.delete(res.length() - 1, res.length()));
	}

}