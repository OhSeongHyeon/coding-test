import java.util.stream.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Stream.of(br.readLine().split("\\s+"))
            .mapToInt(Integer::parseInt)
            .toArray();
        int t = Integer.parseInt(br.readLine());
        int defaultTime = 30;
        System.out.println(parkingCharge(defaultTime, t, arr));
    }
    
    public static int parkingCharge(int defaultTime, int t, int[] arr) {
        if (t <= defaultTime) {
            return arr[0];
        }
        t -= defaultTime;
        int timeExceeded = t/arr[1] + (t%arr[1] == 0 ? 0 : 1);
        int addCharge = timeExceeded * arr[2];
        return arr[0] + addCharge;
    }

}