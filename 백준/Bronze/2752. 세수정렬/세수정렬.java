import java.util.*;
import java.util.stream.Collectors;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String res = Arrays.stream(br.readLine().split("\\s"))
				.mapToInt(Integer::parseInt)
				.sorted()
				.mapToObj(Integer::toString)
				.collect(Collectors.joining(" "));
		System.out.println(res);
    }

}