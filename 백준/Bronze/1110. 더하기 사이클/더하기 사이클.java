import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), r = n, cnt = 0;
		do {} while((cnt += 1) > 0 && n != (r = r < 10 ? r*10 + r : r%10*10 + (r/10 + r%10)%10));
		System.out.println(cnt);
	}

}