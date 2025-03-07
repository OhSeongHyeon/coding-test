import java.io.*;

// 백준 1773 폭죽쇼, https://www.acmicpc.net/problem/1773
// 배열 카운팅 (배열 카운팅 할때 스트림말고 for문이 나은거 같다)
// 최소공배수 구할 경우 조합의 경우의 수가 너무 많으니 배열카운팅 방식이 나은듯
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sp = br.readLine().split("\\s");
        int n = Integer.parseInt(sp[0]);
        int c = Integer.parseInt(sp[1]);
        int[] arr = new int[c + 1];
        int cnt = 0;

        while (n-- > 0) {
            int fireworks = Integer.parseInt(br.readLine());

            for (int i = fireworks; i <= c; i += fireworks) {
                arr[i]++;
            }
        }

        for (int i : arr) {
            if (i > 0) cnt++;
        }

        System.out.println(cnt);
    }

}