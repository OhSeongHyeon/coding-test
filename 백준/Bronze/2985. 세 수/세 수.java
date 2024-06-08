import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        if (a + b == c) {
            System.out.println(a + "+" + b + "=" + c);
        } else if (a - b == c) {
            System.out.println(a + "-" + b + "=" + c);
        } else if (a * b == c) {
            System.out.println(a + "*" + b + "=" + c);
        } else if (b != 0 && a / b == c && a % b == 0) {
            System.out.println(a + "/" + b + "=" + c);
        } else if (a == b + c) {
            System.out.println(a + "=" + b + "+" + c);
        } else if (a == b - c) {
            System.out.println(a + "=" + b + "-" + c);
        } else if (a == b * c) {
            System.out.println(a + "=" + b + "*" + c);
        } else if (c != 0 && a == b / c && b % c == 0) {
            System.out.println(a + "=" + b + "/" + c);
        }
    }

}