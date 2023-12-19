import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int bab = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		int ctp = Integer.parseInt(br.readLine()) * 2;
		System.out.println(bab < ctp ? bab : bab-ctp);
    }

}