import java.util.*;

class Solution {
    public int solution(String my_string) {
		String cs = my_string.replaceAll("\\D+", " ").trim();
        return cs.isBlank() ? 0 : Arrays.stream(cs.split("\\s")).mapToInt(Integer::parseInt).sum();
    }
}