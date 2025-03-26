import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] abcd = Stream.of(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] pmn = Stream.of(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] attk = new int[pmn.length];

        for (int i = 0; i < pmn.length; i++) {
            //나눈 나머지가 0이면 휴지기 시간에 포함되어 제외
            //나눈 나머지가 0보다 크면 멍멍쓰 흥분하고 있는 시간 내에 있는지 체크
            int dog1 = pmn[i] % (abcd[0] + abcd[1]);
            if (dog1 > 0 && dog1 <= abcd[0]) {
                attk[i]++;
            }
            int dog2 = pmn[i] % (abcd[2] + abcd[3]);
            if (dog2 > 0 && dog2 <= abcd[2]) {
                attk[i]++;
            }
        }

        System.out.print(Arrays.stream(attk).boxed().map(String::valueOf).collect(Collectors.joining("\n")));
    }

}