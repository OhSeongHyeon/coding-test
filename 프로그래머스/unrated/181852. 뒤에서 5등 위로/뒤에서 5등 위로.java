import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        return Arrays.stream(num_list).sorted().skip(5).limit(num_list.length).toArray();
    }
}