import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double era = Double.parseDouble(st.nextToken());
		double iera = Double.parseDouble(st.nextToken());
		double dec = era - (era * iera / 100.0);
		System.out.println(dec < 100.0 ? 1 : 0);
    }

}