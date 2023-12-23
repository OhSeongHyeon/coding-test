import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int rotn = (n-1)/4; // 손 뒤집은 횟수
		boolean und = rotn%2==1 ? true : false; // t: 손바닥이 천장을 봄, f: 손등이 천장을 봄
		System.out.println(und ? 5 - (n-1)%4 : (n-1)%4 + 1);
	}

}