import java.util.stream.*;
import java.util.*;
import java.io.*;

// https://www.acmicpc.net/problem/24511
public class Main {

    // 시간 초과 O(n*m) => 테스트 케이스 10억번
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int[] aArrNlen = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        int[] bArrNlen = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        int m = Integer.parseInt(br.readLine());
//        int[] cArrMlen = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        StringBuilder sb = new StringBuilder();
//        
//        for (int mm = 0; mm < m; mm++) {
//            int x = cArrMlen[mm];
//            for (int nn = 0; nn < n; nn++) {
//                if (aArrNlen[nn] == 1) continue;
//                int pop = bArrNlen[nn];
//                bArrNlen[nn] = x;
//                x = pop;
//            }
//            sb.append(x).append(" ");
//        }
//        
//        sb.setLength(sb.length() - 1);
//        System.out.println(sb);
//    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] aSeqArr = br.readLine().split(" ");
        String[] bSeqArr = br.readLine().split(" ");
        Deque<Integer> deque = createDeque(n, aSeqArr, bSeqArr);
        int m = Integer.parseInt(br.readLine());
        String[] cSeqArr = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < m; i++) {
            deque.addFirst(Integer.parseInt(cSeqArr[i]));
            sb.append(deque.pollLast()).append(" ");
        }
        
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }

    private static Deque<Integer> createDeque(int n, String[] aSeqArr, String[] bSeqArr) {
        Deque<Integer> deque = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            if ("1".equals(aSeqArr[i])) continue;
            deque.addLast(Integer.parseInt(bSeqArr[i]));
        }
        
        return deque;
    }

}