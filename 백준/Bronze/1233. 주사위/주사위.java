import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split(" ");
        int s1 = Integer.parseInt(sp[0]);
        int s2 = Integer.parseInt(sp[1]);
        int s3 = Integer.parseInt(sp[2]);
        int maxSum = s1 + s2 + s3;
        int[] frequency = new int[maxSum + 1];

        for (int i = 1; i <= s1; i++) {
            for (int j = 1; j <= s2; j++) {
                for (int k = 1; k <= s3; k++) {
                    int sum = i + j + k;
                    frequency[sum]++;
                }
            }
        }

        int maxFrequency = 0;
        int result = 0;
        for (int sum = 3; sum <= maxSum; sum++) {
            if (frequency[sum] > maxFrequency) {
                maxFrequency = frequency[sum];
                result = sum;
            }
        }
        
        System.out.println(result);
    }
	
}