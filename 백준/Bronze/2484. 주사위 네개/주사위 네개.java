import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int maxPrize = 0;

        for (int i = 0; i < n; i++) {
        	String[] sp = br.readLine().split(" ");
            int[] dice = new int[4];
            for (int j = 0; j < 4; j++) {
                dice[j] = Integer.parseInt(sp[j]);
            }
            int prize = calculatePrize(dice);
            if (prize > maxPrize) {
                maxPrize = prize;
            }
        }
        
        System.out.println(maxPrize);
    }
	
	private static int calculatePrize(int[] dice) {
        Map<Integer, Integer> counts = new HashMap<>();
        
        for (int d : dice) {
            counts.put(d, counts.getOrDefault(d, 0) + 1);
        }

        if (counts.containsValue(4)) {
            for (int num : counts.keySet()) {
                if (counts.get(num) == 4) {
                    return 50000 + num * 5000;
                }
            }
        } else if (counts.containsValue(3)) {
            for (int num : counts.keySet()) {
                if (counts.get(num) == 3) {
                    return 10000 + num * 1000;
                }
            }
        } else if (counts.containsValue(2) && counts.size() == 2) {
            int prize = 2000;
            for (int num : counts.keySet()) {
                prize += num * 500;
            }
            return prize;
        } else if (counts.containsValue(2)) {
            for (int num : counts.keySet()) {
                if (counts.get(num) == 2) {
                    return 1000 + num * 100;
                }
            }
        } else {
            int maxNum = 0;
            for (int num : dice) {
                maxNum = Math.max(maxNum, num);
            }
            return maxNum * 100;
        }
        return 0;
    }
	
}