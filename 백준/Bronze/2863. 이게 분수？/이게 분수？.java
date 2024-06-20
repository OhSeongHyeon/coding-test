import java.util.*;
import java.io.*;

public class Main {

	/* 그냥 이렇게 하면됨
	 * arr[0] = (A / C) + (B / D);
		arr[1] = (C / D) + (A / B);
		arr[2] = (D / B) + (C / A);
		arr[3] = (B / A) + (D / C);
	 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] arr = Arrays.stream((br.readLine() + " " + br.readLine()).split("\\s+"))
        	.mapToDouble(Double::parseDouble)
        	.toArray();
        double[] calcRes = new double[4];
        double max = Double.MIN_VALUE;
        int target = 0;
        
        for (int i = 0; i < calcRes.length; i++) {
        	calcRes[i] = arr[0]/arr[2] + arr[1]/arr[3];
        	max = Math.max(max, calcRes[i]);
        	// rotate
        	double tmp1 = arr[0];
        	double tmp2 = arr[1];
        	double tmp3 = arr[3];
        	arr[0] = arr[2];
        	arr[1] = tmp1;//arr[0];
        	arr[3] = tmp2;//arr[1];
        	arr[2] = tmp3;//arr[3];
		}
        
        for (int i = 0; i < calcRes.length; i++) {
			if(max == calcRes[i]) {
				target = i;
				break;
			}
		}
        
        System.out.println(target);
    }

}