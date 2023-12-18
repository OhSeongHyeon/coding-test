import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        double[] arr = Arrays.stream(input.split("\\s"))
        	.mapToDouble(Double::parseDouble)
        	.toArray();
        
        double res1 = arr[0] * arr[1] / arr[2];
        double res2 = arr[0] / arr[1] * arr[2];
        double res = res1 >= res2 ? res1 : res2;
        
        System.out.println((int) res);
    }

}