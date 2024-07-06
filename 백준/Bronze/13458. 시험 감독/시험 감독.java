import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] sp1 = br.readLine().split("\\s+");
        String[] sp2 = br.readLine().split("\\s+");
        int b = Integer.parseInt(sp2[0]);
        int c = Integer.parseInt(sp2[1]);
        long sum = n; // 아 int 쓰면 틀리는거냐...
        
        for (int i = 0; i < n; i++) {
			int ai = Integer.parseInt(sp1[i]);
			int remain = ai-b;
			if(remain > 0) {
				sum += remain%c == 0 ? remain/c : remain/c + 1;
			}
		}
        
        System.out.println(sum);
    }

}