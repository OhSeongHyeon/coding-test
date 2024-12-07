import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
        int HH = Integer.parseInt(st.nextToken());
        int MM = Integer.parseInt(st.nextToken());
        
        int startMinutes = 9 * 60;
        int totalMinutes = HH * 60 + MM;
        int elapsedMinutes = totalMinutes - startMinutes;
        
        System.out.println(elapsedMinutes);
	}

}