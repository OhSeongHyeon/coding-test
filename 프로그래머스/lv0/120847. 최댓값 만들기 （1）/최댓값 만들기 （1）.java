import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int[] arr = Arrays.stream(numbers).sorted().toArray();
        return arr[arr.length-1]*arr[arr.length-2];
    }
}