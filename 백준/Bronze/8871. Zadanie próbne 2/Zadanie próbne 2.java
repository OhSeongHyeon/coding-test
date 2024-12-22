import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int minTasks = 2 * (n + 1);
        int maxTasks = 3 * (n + 1);
        System.out.println(minTasks + " " + maxTasks);
    }
}
