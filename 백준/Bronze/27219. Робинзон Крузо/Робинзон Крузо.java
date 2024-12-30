import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int numV = n / 5;
        int numI = n % 5;

        StringBuilder result = new StringBuilder();
        result.append("V".repeat(numV));
        result.append("I".repeat(numI));
        
        System.out.println(result);
    }
}
