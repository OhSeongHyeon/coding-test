import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sp1 = br.readLine().split("\\s");
		int m = Integer.parseInt(sp1[1]);
		AtomicInteger t = new AtomicInteger(0);
		String[] sp2 = br.readLine().split("\\s");
		long cnt = Arrays.stream(sp2)
			.mapToInt(Integer::parseInt)
			.filter(i -> {
				if(t.addAndGet(i) < 0) {
					t.set(0);
				}
				return t.get() >= m;
			})
			.count();
		System.out.println(cnt);
	}

}