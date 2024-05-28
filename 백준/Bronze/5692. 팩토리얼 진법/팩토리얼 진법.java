import java.util.stream.Collectors;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] fa = new int[6];
		fa[0] = 1;
		for (int i = 1; i < fa.length; i++) {
			fa[i] = fa[i-1] * i;
		}
		
		String result = br.lines()
                .takeWhile(line -> !line.equals("0"))
                .map(s -> {
                	int res = 0;
                	int len = s.length();
                	for (int i = 0; i < len; i++) {
						int n = s.charAt(i) - '0';
						res += n * fa[len-i];
					}
                	return String.valueOf(res);
                })
                .collect(Collectors.joining("\n"));
		System.out.println(result);
	}

}