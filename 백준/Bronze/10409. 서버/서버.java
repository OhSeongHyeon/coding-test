import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split("\\s");
        //int n = Integer.parseInt(sp[0]);
        int t = Integer.parseInt(sp[1]);
        AtomicInteger ati = new AtomicInteger(0);
        long cnt = Arrays.stream(br.readLine().split("\\s"))
        	.mapToInt(Integer::parseInt)
        	.filter(i -> ati.addAndGet(i) <= t)
        	.count();
        System.out.println(cnt);
    }

}