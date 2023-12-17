import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr0 = createBasket(br.readLine());
        int[] arr1 = createBasket(br.readLine());
        int case0 = arr0[0] + arr1[1];
        int case1 = arr0[1] + arr1[0];
        System.out.println(case0 <= case1 ? case0 : case1);
    }

	private static int[] createBasket(String input) {
		return Arrays.stream(input.split("\\s"))
        		.mapToInt(Integer::parseInt)
        		.toArray();
	}

}