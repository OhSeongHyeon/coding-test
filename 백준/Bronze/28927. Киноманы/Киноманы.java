import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] maxInput = br.readLine().split(" ");
        String[] melInput = br.readLine().split(" ");
        
        int t1 = Integer.parseInt(maxInput[0]);
        int e1 = Integer.parseInt(maxInput[1]);
        int f1 = Integer.parseInt(maxInput[2]);
        
        int t2 = Integer.parseInt(melInput[0]);
        int e2 = Integer.parseInt(melInput[1]);
        int f2 = Integer.parseInt(melInput[2]);

        int timeMax = 3 * t1 + 20 * e1 + 120 * f1;
        int timeMel = 3 * t2 + 20 * e2 + 120 * f2;

        if (timeMax > timeMel) {
            System.out.println("Max");
        } else if (timeMax < timeMel) {
            System.out.println("Mel");
        } else {
            System.out.println("Draw");
        }
    }
}
