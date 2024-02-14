import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine().split("\\s")[1]);
		AtomicInteger res = new AtomicInteger(l);
		Arrays.stream(br.readLine().split("\\s"))
			.mapToInt(Integer::parseInt)
			.sorted()
			.takeWhile(i -> i <= res.get() && res.getAndIncrement() > 0)
			.count(); // 원본값 변경 수행용
		System.out.println(res.get());
	}

}