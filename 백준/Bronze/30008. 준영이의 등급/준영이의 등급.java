import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int students = Integer.parseInt(st.nextToken());
		int subjects = Integer.parseInt(st.nextToken());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < subjects; i++) {
			int g = Integer.parseInt(st1.nextToken());
			sb.append(classifyGrade(g*100/students)).append(i < subjects-1 ? " " : "");
		}
		
		System.out.println(sb);
	}
	
	private static int classifyGrade(int p) {
        if (0 <= p && p <= 4) {
            return 1;
        } else if (4 < p && p <= 11) {
        	return 2;
        } else if (11 < p && p <= 23) {
        	return 3;
        } else if (23 < p && p <= 40) {
        	return 4;
        } else if (40 < p && p <= 60) {
        	return 5;
        } else if (60 < p && p <= 77) {
        	return 6;
        } else if (77 < p && p <= 89) {
        	return 7;
        } else if (89 < p && p <= 96) {
        	return 8;
        }
        return 9;
    }

}