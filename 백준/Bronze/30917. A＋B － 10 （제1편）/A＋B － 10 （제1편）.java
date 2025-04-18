import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = askNum(br, "A");
        int b = askNum(br, "B");
        System.out.printf("! %d", a + b);
    }
    
    private static int askNum(BufferedReader br, String questionTarget) throws Exception {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("? %s %d\n", questionTarget, i);
            
            int response = Integer.parseInt(br.readLine());
            
            if (response == 1) {
                return i;
            }
        }
        return -1;
    }
}