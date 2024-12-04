import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
        int openIndex = s.indexOf('(');
        int oneIndex = s.indexOf('1');
        int closeIndex = s.indexOf(')');
        int moves = 0;
        if (openIndex > oneIndex) moves++;
        if (oneIndex > closeIndex) moves++;
        System.out.println(moves);
	}

}