import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ){
            int tc = Integer.parseInt(br.readLine());
            int[][] cdnt = new int[tc][2]; // coordinates
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < tc; i++) {
                cdnt[i] = Arrays.stream(br.readLine().split("\\s"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            }

            Arrays.sort(cdnt, (a, b) -> {
                if (a[1] == b[1]) {
                    return Integer.compare(a[0], b[0]);
                }
                return Integer.compare(a[1], b[1]);
            });

            Arrays.stream(cdnt).forEach(arr -> {
                sb.append(String.format("%d %d\n", arr[0], arr[1]));
            });

            bw.write(sb.toString());
            bw.flush();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

}