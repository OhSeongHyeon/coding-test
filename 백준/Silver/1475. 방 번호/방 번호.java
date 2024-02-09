import java.io.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String input = br.readLine();
    	int len = input.length();
    	int[] arr = new int[9]; // 6, 9는 같아서 9는 카운팅 6으로 카운팅함.
    	int max = Integer.MIN_VALUE;
    	
    	for(int i = 0; i < len; i++) {
    		int n = Character.getNumericValue(input.charAt(i));
    		arr[n == 9 ? 6 : n]++;
    	}
    	
    	arr[6] = arr[6]%2 == 0 ? arr[6]/2 : arr[6]/2 + 1;
    	
    	for(int i : arr) {
    		max = Math.max(max, i);
    	}
    	
    	System.out.println(max);
    }

}