import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int[] arr = new int[5];
    	
    	for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
    	
    	int ac = arr[1]%arr[3] == 0 ? arr[1]/arr[3] : arr[1]/arr[3] + 1;
    	int bd = arr[2]%arr[4] == 0 ? arr[2]/arr[4] : arr[2]/arr[4] + 1;
    	
    	System.out.println(arr[0] - Math.max(ac, bd));
    }
}