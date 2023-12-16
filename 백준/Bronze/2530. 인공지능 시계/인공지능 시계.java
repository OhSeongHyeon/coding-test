import java.util.*;
import java.io.*;
import java.time.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input0 = br.readLine();
        String input1 = br.readLine();
        int[] arr = Arrays.stream(input0.split("\\s"))
        		.mapToInt(Integer::parseInt)
        		.toArray();
        LocalTime resTime = LocalTime.of(arr[0], arr[1], arr[2])
        		.plusSeconds(Integer.parseInt(input1));
        System.out.printf("%d %d %d", resTime.getHour(), resTime.getMinute(), resTime.getSecond());
    }

}