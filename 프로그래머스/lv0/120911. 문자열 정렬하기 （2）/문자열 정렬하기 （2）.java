import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] ca = my_string.toLowerCase().toCharArray();
        Arrays.sort(ca);
        return String.valueOf(ca);
    }
}