import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();

        int count = 0;
        for (char c : S.toCharArray()) {
            if ("aiueo".indexOf(c) != -1) {
                count++;
            }
        }

        System.out.println(count);
    }
}
