import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int comp = 10;
        while (n > comp) {
			int nModComp = n % comp;

			if (nModComp * 10 / comp >= 5) {
				n += comp;
			}

			n -= nModComp;
			comp *= 10;
		}
        System.out.println(n);
    }

}