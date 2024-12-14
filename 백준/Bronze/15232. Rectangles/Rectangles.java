import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        StringBuilder row = new StringBuilder();

        for (int i = 0; i < c; i++) {
            row.append("*");
        }
        for (int i = 0; i < r; i++) {
            System.out.println(row);
        }
	}

}