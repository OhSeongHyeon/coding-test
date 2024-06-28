import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split("\\s+"))
        	.mapToInt(Integer::parseInt)
        	.toArray();
        long evenCnt = Arrays.stream(arr)
        	.filter(n -> n%2 == 0)
        	.count();
        System.out.println(calcRes(arr, 1, evenCnt == 3 ? 0 : 1));
    }

	private static int calcRes(int[] arr, int res, int flag) {
		for (int i = 0; i < arr.length; i++) {
			res *= arr[i]%2 == flag ? arr[i] : 1;
		}
		return res;
	}

}