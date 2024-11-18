import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split(" ");
        int a = Integer.parseInt(sp[0]);
        int b = Integer.parseInt(sp[1]);
        int res = 0; 
        
        int index = 1;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j < i; j++) {
                if (index >= a && index <= b) {
                    res += i;
                }
                index++;
                if (index > b) break;
            }
            if (index > b) break;
        }

        System.out.println(res);
    }

}
