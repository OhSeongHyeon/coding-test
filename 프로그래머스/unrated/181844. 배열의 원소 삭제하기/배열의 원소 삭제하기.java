import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] dla) {
		return Arrays.stream(arr).filter(n -> {
			for (int i : dla) {
				if(n == i) return false;
			}
			return true;
		}).toArray();
    }
}