import java.io.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	long s = Long.parseLong(br.readLine());
    	long sum = 0; // int형쓰면 스택오버플로우 (음수로가서 시간초과)
    	int cnt = 1;
    	
    	while(sum <= s) {
    		sum += cnt++;
    	}
    	
    	// 누적합에 사용된 자연수 갯수만 구해야됨.
    	System.out.println(cnt-2);
    }

}