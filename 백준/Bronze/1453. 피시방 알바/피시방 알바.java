import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] sp = br.readLine().split("\\s+");
		int rejectCnt = 0;
		/*
		boolean[] isSeatArr = new boolean[101];

		for (int i = 0; i < n; i++) {
			int seatNum = Integer.parseInt(sp[i]);
			boolean isSeat = isSeatArr[seatNum];
			if( !isSeat ) {
				isSeatArr[seatNum] = true;
			}else {
				rejectCnt++;
			}
		}
		*/
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < n; i++) {
			int seatNum = Integer.parseInt(sp[i]);
			if( !set.add(seatNum) ) {
				rejectCnt++;
			}
		}
		

		System.out.println(rejectCnt);
	}

}