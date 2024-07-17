import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = br.lines()
			.takeWhile(line -> line != null && !line.isEmpty())
			.mapToInt(Integer::parseInt)
			.toArray();

        int leftCnt = countVisible(arr, 0, n, 1);
        int rightCnt = countVisible(arr, n - 1, -1, -1);

        System.out.printf("%d\n%d", leftCnt, rightCnt);
    }

    private static int countVisible(int[] arr, int start, int end, int step) {
        int count = 1;
        int maxHeight = arr[start];

        for (int i = start + step; i != end; i += step) {
            if (maxHeight < arr[i]) {
                maxHeight = arr[i];
                count++;
            }
        }

        return count;
    }
}