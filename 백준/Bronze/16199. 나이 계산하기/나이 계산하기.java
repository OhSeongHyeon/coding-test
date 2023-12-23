import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] birthArr = parseDateArray(br.readLine());
		int[] baseDateArr = parseDateArray(br.readLine());
		LocalDate birth = LocalDate.of(birthArr[0], birthArr[1], birthArr[2]);
		LocalDate baseDate = LocalDate.of(baseDateArr[0], baseDateArr[1], baseDateArr[2]);
		int k_age = baseDateArr[0] - birthArr[0] + 1;
		
		StringBuilder sb = new StringBuilder();
		sb.append(ChronoUnit.YEARS.between(birth, baseDate)).append("\n")
			.append(k_age).append("\n")
			.append(k_age-1);
		
		System.out.println(sb);
	}

	private static int[] parseDateArray(String input) {
		return Arrays.stream(input.split("\\s"))
			.mapToInt(Integer::parseInt)
			.toArray();
	}
}