import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" "))
        	.mapToInt(Integer::parseInt)
        	.toArray();
        int cdt = 1;
        
        while(true) {
        	int cnt = 0;
        	for(int num : arr) {
        		if(cdt%num == 0) cnt++;
        	}
        	if(cnt >= 3) {
        		System.out.println(cdt);
        		break;
        	}
        	cdt++;
        }
    }

}